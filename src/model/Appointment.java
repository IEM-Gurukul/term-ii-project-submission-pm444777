package model;

public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private String date;

    // Constructor
    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    // Getters
    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    // Display appointment details
    public void displayAppointment() {
        System.out.println("Appointment Details:");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date: " + date);
    }
}
