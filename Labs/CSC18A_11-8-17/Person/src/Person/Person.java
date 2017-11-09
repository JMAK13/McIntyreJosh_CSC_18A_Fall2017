package Person;

public class Person {
    private String lastname;
    private String firstname;
    private double weight;
    private double height;
    private int age;
    
    // constructor
    public Person(String LastName, String FirstName, int Age)
    {
        lastname = LastName;
        firstname = FirstName;
        this.setAge(Age);
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the age to set
     */
    public void setWeight(double weight) {
        if ( weight >= 0 )
            this.weight = weight;
        else
            throw new IllegalArgumentException("Weight must be greater than or equal to 0 pounds");
    }
    
    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the age to set
     */
    public void setHeight(double height) {
        if ( height >= 6 )
            this.height = height;
        else
            throw new IllegalArgumentException("Height must be greater than or equal to 6 inches");
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        if ( age >= 0 )
            this.age = age;
        else
            throw new IllegalArgumentException("Age must be greater than or equal to 0");
    }
    
    @Override
    public String toString()
    {
        return lastname+", "+firstname+", "+age;
    }
}
