package Person;

/**
 * Author: Josh McIntyre
 * Purpose: Lab for class inheritance
 */
public class Patient extends Person {
    
    private int systolic_blood_pressure;
    private int diastolic_blood_pressure;
    private int pulse;
    
    public Patient(String LastName, String FirstName, int Age) {
        super(LastName, FirstName, Age);
        systolic_blood_pressure=-1;
        diastolic_blood_pressure=-1;
        pulse=-1;
    }
    
    public Patient(Person patient)
    {
        super(patient.getLastname(),patient.getFirstname(),
              patient.getAge());
        systolic_blood_pressure=-1;
        diastolic_blood_pressure=-1;
        pulse=-1;
    }
    
    /**
     * @return the systolic blood pressure
     */
    public int getSystolic() {
        return systolic_blood_pressure;
    }

    /**
     * @param systolic_blood_pressure the systolic blood pressure to set
     */
    public void setSystolic(int systolic_blood_pressure) {
        if (systolic_blood_pressure >= 0)
            this.systolic_blood_pressure = systolic_blood_pressure;
        else throw new IllegalArgumentException("Systolic blood pressure must be greater than or equal to 0");
    }
    
    /**
     * @return the diastolic blood pressure
     */
    public int getDiastolic() {
        return diastolic_blood_pressure;
    }

    /**
     * @param diastolic_blood_pressure the diastolic blood pressure to set
     */
    public void setDiastolic(int diastolic_blood_pressure) {
        if (diastolic_blood_pressure >= 0)
            this.diastolic_blood_pressure = diastolic_blood_pressure;
        else throw new IllegalArgumentException("Diastolic blood pressure must be greater than or equal to 0");
    }
    
    /**
     * @return the pulse
     */
    public int getPulse() {
        return pulse;
    }

    /**
     * @param pulse the pulse to set
     */
    public void setPulse(int pulse) {
        if (pulse >= 0)
            this.pulse = pulse;
        else throw new IllegalArgumentException("Pulse must be greater than or equal to 0 beats per minute");
    }
    
    @Override
    public String toString()
    {
        return super.toString()+", "+systolic_blood_pressure+", "+diastolic_blood_pressure+", "+pulse;
    }
}
