[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Hospital Appointment Management System

## Problem Statement (max 150 words)

Hospitals and clinics often manage appointments manually or using simple record systems that are difficult to organize and maintain. When multiple patients need to schedule appointments with different doctors, manual systems can lead to scheduling conflicts, lost records, and inefficient management of patient information.

The proposed Hospital Appointment Management System aims to provide a simple software-based solution for managing patient registrations, doctor information, and appointment scheduling. By applying object-oriented programming principles in Java, the system models real-world entities such as patients, doctors, and appointments as separate classes. This approach improves code organization, modularity, and maintainability while demonstrating practical implementation of core OOP concepts.

## Target User

The system is designed for:

• Small hospitals and clinics
• Reception staff responsible for appointment booking
• Doctors who need quick access to patient appointment details
• Administrators managing patient and doctor records

## Core Features

• Register and store patient information
• Store and manage doctor details
• Schedule appointments between patients and doctors
• Display appointment schedules
• Search for patients or doctors in the system
• Prevent invalid data entries using exception handling
• Maintain lists of patients, doctors, and appointments using Java collections


## OOP Concepts Used

✔ Inheritance
A base class Person will be extended by subclasses Patient and Doctor.

✔ Polymorphism
Methods such as displayDetails() will behave differently for Patient and Doctor classes.

✔ Abstraction
The base class Person will define common attributes and behavior shared by different types of users.

✔ Exception Handling
Try-catch blocks will handle invalid input and runtime errors.

✔ Collections
Java collections such as ArrayList will store patient records, doctor records, and appointments.


## Proposed Architecture Description

The system follows a simple object-oriented architecture consisting of entity classes and a management layer.

The Person abstract class defines common attributes such as name and ID. Two subclasses, Patient and Doctor, inherit from this class and add their own specific attributes.

An Appointment class represents the relationship between a patient and a doctor along with appointment details such as date and time.

A central HospitalManager class handles the core operations of the system, including adding patients, adding doctors, scheduling appointments, and displaying stored data. Java collections are used to store and manage objects dynamically.

The Main class provides a menu-driven interface that allows users to interact with the system and perform various operations.


## How to Run



## Git Discipline Notes
Minimum 10 meaningful commits required.
