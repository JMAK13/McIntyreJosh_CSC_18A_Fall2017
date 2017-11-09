package Person;

public class Student extends Person {
    private double gpa;
    private String major;
    
    public Student(String LastName, String FirstName, int Age) {
        super(LastName, FirstName, Age);
        gpa=-1;
        major="Undeclared";        
    }
    
    public Student(Person student)
    {
        super(student.getLastname(),student.getFirstname(),
              student.getAge());
        gpa=-1;
        major="Undeclared";
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0)
            this.gpa = gpa;
        else throw new IllegalArgumentException("GPA must between 0.0 and 4.0");
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        if ( major=="" )
            this.major="Undeclared";
        else
            this.major = major;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+", "+gpa+", "+major;
    }
}
