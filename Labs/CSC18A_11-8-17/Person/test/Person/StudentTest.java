package Person;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    
    public StudentTest() {
    }

    /**
     * Test of getGpa method, of class Student.
     */
    @Test
    public void testGetGpa1() {
        System.out.println("getGpa1");
        Student instance = new Student("Doe", "John", 33);
        double expResult = -1.0;
        double result = instance.getGpa();
        assertEquals(expResult, result, 0.0);        
    }

    @Test
    public void testGetGpa2() {
        System.out.println("getGpa");
        Person student = new Person("Doe", "John", 33);
        Student instance = new Student(student);
        double expResult = -1.0;
        double result = instance.getGpa();
        assertEquals(expResult, result, 0.0);        
    }
    /**
     * Test of setGpa method, of class Student.
     */
    @Test
    public void testSetGpa() {
        System.out.println("setGpa");
        double gpa = 3.5;
        Student instance = new Student("Doe", "John", 33);
        instance.setGpa(gpa);        
        assertEquals(gpa,instance.getGpa(),0.0);
    }

    /**
     * Test of getMajor method, of class Student.
     */
    @Test
    public void testGetMajor() {
        System.out.println("getMajor");
        Student instance = new Student("Doe", "John", 33);
        String expResult = "Undeclared";
        String result = instance.getMajor();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setMajor method, of class Student.
     */
    @Test
    public void testSetMajor() {
        System.out.println("setMajor");
        String major = "CSC";
        Student instance = new Student("Doe", "John", 33);
        instance.setMajor(major);        
        assertEquals(major,instance.getMajor());
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("Doe", "John", 33);
        instance.setGpa(3.5);
        String expResult = "Doe, John, 33, 3.5, Undeclared";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
