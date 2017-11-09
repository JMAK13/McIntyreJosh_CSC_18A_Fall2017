/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joshr
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSystolic method, of class Patient.
     */
    @Test
    public void testGetSystolic1() {
        System.out.println("getSystolic1");
        Patient instance = new Patient("Doe", "Jane", 21);
        instance.setSystolic(25);
        int expResult = 25;
        int result = instance.getSystolic();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetSystolic2() {
        System.out.println("getSystolic2");
        Patient instance = new Patient("Doe", "John", 22);
        instance.setSystolic(0);
        int expResult = 0;
        int result = instance.getSystolic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSystolic method, of class Patient.
     */
    @Test
    public void testSetSystolic1() {
        System.out.println("setSystolic1");
        int systolic_blood_pressure = 0;
        Patient instance = new Patient("Doe", "Jane", 23);
        instance.setSystolic(systolic_blood_pressure);
    }
        
    @Test
    public void testSetSystolic2() {
        System.out.println("setSystolic2");
        int systolic_blood_pressure = 0;
        Patient instance = new Patient("Doe", "John", 24);
        instance.setSystolic(systolic_blood_pressure);
    }

    /**
     * Test of getDiastolic method, of class Patient.
     */
    @Test
    public void testGetDiastolic1() {
        System.out.println("getDiastolic1");
        Patient instance = new Patient("Doe", "Jane", 25);
        instance.setDiastolic(0);
        int expResult = 0;
        int result = instance.getDiastolic();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDiastolic2() {
        System.out.println("getDiastolic2");
        Patient instance = new Patient("Doe", "John", 26);
        instance.setDiastolic(23);
        int expResult = 23;
        int result = instance.getDiastolic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDiastolic method, of class Patient.
     */
    @Test
    public void testSetDiastolic1() {
        System.out.println("setDiastolic1");
        int diastolic_blood_pressure = 32;
        Patient instance = new Patient("Doe", "Jane", 27);
        instance.setDiastolic(diastolic_blood_pressure);
    }
    
    @Test
    public void testSetDiastolic2() {
        System.out.println("setDiastolic2");
        int diastolic_blood_pressure = 0;
        Patient instance = new Patient("Doe", "John", 28);
        instance.setDiastolic(diastolic_blood_pressure);
    }

    /**
     * Test of getPulse method, of class Patient.
     */
    @Test
    public void testGetPulse1() {
        System.out.println("getPulse1");
        Patient instance = new Patient("Doe", "Jane", 29);
        instance.setPulse(0);
        int expResult = 0;
        int result = instance.getPulse();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPulse2() {
        System.out.println("getPulse2");
        Patient instance = new Patient("Doe", "John", 30);
        instance.setPulse(30);
        int expResult = 30;
        int result = instance.getPulse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPulse method, of class Patient.
     */
    @Test
    public void testSetPulse1() {
        System.out.println("setPulse1");
        int pulse = 0;
        Patient instance = new Patient("Doe", "Jane", 31);
        instance.setPulse(pulse);
    }
    
    @Test
    public void testSetPulse2() {
        System.out.println("setPulse2");
        int pulse = 0;
        Patient instance = new Patient("Doe", "John", 32);
        instance.setPulse(pulse);
    }

    /**
     * Test of toString method, of class Patient.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Patient instance = new Patient("Doe", "Jane", 33);
        instance.setSystolic(0);
        instance.setDiastolic(0);
        instance.setPulse(0);
        String expResult = "Doe, Jane, 33, "+instance.getSystolic()+", "+instance.getDiastolic()+", "+instance.getPulse();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
