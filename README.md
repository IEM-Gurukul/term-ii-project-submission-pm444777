# PCCCS495 – Term II Project

## Project Title

Hospital Appointment Management System

---

## Problem Statement 

Hospitals and clinics often manage appointments manually or using simple record systems that are difficult to organize and maintain. When multiple patients need to schedule appointments with different doctors, manual systems can lead to scheduling conflicts, misplaced records, and inefficient handling of patient data.

The Hospital Appointment Management System provides a simple software-based solution to manage patient and doctor information in a structured way. Using object-oriented programming in Java, the system models real-world entities such as patients, doctors, and appointments as separate classes. This improves code organization, modularity, and maintainability.

---

## Target User

• Small hospitals and clinics
• Reception staff responsible for appointment booking
• Doctors who need quick access to patient details
• Administrators managing records

---

## Core Features

• Register and store patient information
• Store and manage doctor details
• Display list of patients and doctors
• View appointment-related data
• Menu-driven user interface
• Input validation using exception handling
• Use of Java Collections (ArrayList) for data storage

---

## OOP Concepts Used

✔ **Abstraction**
Implemented using abstract class `Person`.

✔ **Inheritance**
`Patient` and `Doctor` classes extend `Person`.

✔ **Polymorphism**
Method `displayInfo()` is overridden in subclasses.

✔ **Encapsulation**
Private data members with public getter methods.

✔ **Exception Handling**
Used to handle invalid inputs.

✔ **Collections**
ArrayList is used to store and manage data dynamically.

---

## Proposed Architecture Description

The system follows a modular object-oriented design.

The abstract class `Person` defines common attributes such as name and age. The `Patient` and `Doctor` classes extend this class and include their own specific attributes.

The `Appointment` class represents the relationship between a patient and a doctor.

The `HospitalManager` class acts as the core logic handler and manages all operations such as adding patients, adding doctors, and displaying data using ArrayList.

The `Main` class provides a menu-driven interface for user interaction.

---

## How to Run

1. Open terminal in the project folder
2. Navigate to src folder:

   ```
   cd src
   ```
3. Compile the program:

   ```
   javac model\Person.java model\Patient.java model\Doctor.java model\Appointment.java service\HospitalManager.java Main.java
   ```
4. Run the program:

   ```
   java Main
   ```

---

## Git Commits

The project follows proper Git discipline with multiple meaningful commits such as:

• Initial project setup
• Added Person abstract class
• Added Patient class
• Added Doctor class
• Added Appointment class
• Created service package
• Added HospitalManager class
• Fixed folder structure
• Added Main class
• Improved README documentation

All commits were pushed before the deadline as per guidelines.

---

## Author

Parboni Mitra
