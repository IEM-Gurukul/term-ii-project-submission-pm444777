package model;

public class Patient extends Person {

    private String patientId;
    private String disease;

    // Constructor
    public Patient(String name, int age, String patientId, String disease) {
        super(name, age);
        this.patientId = patientId;
        this.disease = disease;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getDisease() {
        return disease;
    }

    // Overriding abstract method
    @Override
    public void displayInfo() {
        System.out.println("Patient Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Patient ID: " + patientId);
        System.out.println("Disease: " + disease);
    }
}
