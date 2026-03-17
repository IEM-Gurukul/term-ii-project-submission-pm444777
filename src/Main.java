import model.*;
import service.HospitalManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalManager hm = new HospitalManager();

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. View Appointments");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter age: ");
                    int page = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter patient ID: ");
                    String pid = sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();

                    hm.addPatient(new Patient(pname, page, pid, disease));
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter age: ");
                    int dage = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter doctor ID: ");
                    String did = sc.nextLine();
                    System.out.print("Enter specialization: ");
                    String spec = sc.nextLine();

                    hm.addDoctor(new Doctor(dname, dage, did, spec));
                    break;

                case 3:
                    hm.displayPatients();
                    break;

                case 4:
                    hm.displayDoctors();
                    break;

                case 5:
                    hm.displayAppointments();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
