package service;

import model.*;
import java.util.ArrayList;

public class HospitalManager {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    // Constructor
    public HospitalManager() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    // Add Patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    // Schedule Appointment
    public void scheduleAppointment(Patient patient, Doctor doctor, String date) {
        Appointment appointment = new Appointment(patient, doctor, date);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    // Display Patients
    public void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }

        for (Patient p : patients) {
            p.displayInfo();
            System.out.println("-------------------");
        }
    }

    // Display Doctors
    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }

        for (Doctor d : doctors) {
            d.displayInfo();
            System.out.println("-------------------");
        }
    }

    // Display Appointments
    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
            return;
        }

        for (Appointment a : appointments) {
            a.displayAppointment();
            System.out.println("-------------------");
        }
    }
}
