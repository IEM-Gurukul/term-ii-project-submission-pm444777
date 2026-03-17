package model;

public class Patient extends Person {

    private String patientId;
    private String disease;

    public Patient(String name, int age, String patientId, String disease) {
        super(name, age);
        this.patientId = patientId;
        this.disease = disease;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient ID: " + patientId);
        System.out.println("Disease: " + disease);
    }
}
