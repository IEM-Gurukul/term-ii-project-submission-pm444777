package model;

public class Doctor extends Person {

    private String doctorId;
    private String specialization;

    // Constructor
    public Doctor(String name, int age, String doctorId, String specialization) {
        super(name, age);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    // Getters
    public String getDoctorId() {
        return doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Overriding abstract method
    @Override
    public void displayInfo() {
        System.out.println("Doctor Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Specialization: " + specialization);
    }
}
