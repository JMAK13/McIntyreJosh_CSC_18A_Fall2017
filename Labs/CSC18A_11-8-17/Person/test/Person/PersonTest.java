package Person;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcc
 */
public class PersonTest {
    
    public PersonTest() {
    }

    /**
     * Test of getLastname method, of class Person.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Person instance = new Person("Doe", "John", 33);
        String expResult = "Doe";
        String result = instance.getLastname();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setLastname method, of class Person.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "Smith";
        Person instance = new Person("Doe", "John", 33);
        instance.setLastname(lastname);
        assertEquals(lastname,instance.getLastname());
    }

    /**
     * Test of getFirstname method, of class Person.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Person instance = new Person("Doe", "John", 33);
        String expResult = "John";
        String result = instance.getFirstname();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setFirstname method, of class Person.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "Jane";
        Person instance = new Person("Doe", "John", 33);
        instance.setFirstname(firstname);        
        assertEquals(firstname,instance.getFirstname());
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new Person("Doe", "John", 33);
        int expResult = 33;
        int result = instance.getAge();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 29;
        Person instance = new Person("Doe", "John", 33);
        instance.setAge(age);
        assertEquals(age,instance.getAge());
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person("Doe", "John", 33);
        String expResult = "Doe, John, 33";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
