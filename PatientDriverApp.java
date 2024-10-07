/*
 * Class: CMSC203 
 * Instructor: David Kujit
 * Description: (Create a patient )
 * Due: 10/06/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Santiago Ardila
*/

import java.util.Scanner;

public class PatientDriverApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter patient's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Patient's Middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String street = scanner.nextLine();
        System.out.print("Patient's city: ");
        String city = scanner.nextLine();
        System.out.print("Patient's state: ");
        String state = scanner.nextLine();
        System.out.print("Patient's zip code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Patient's phone number: ");
        String phoneNum = scanner.nextLine();
        System.out.print("Patient's emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Patient's emergency contact number: ");
        String emergencyContactNum = scanner.nextLine();

        
        Patient patient = new Patient(firstName, middleName, lastName, street, city, state, zipCode, phoneNum, emergencyContactName, emergencyContactNum);
        
        Procedure procedure1 = new Procedure("X-Ray","10/01/2024","Dr. Smith",400.00 ); 
        Procedure procedure2 = new Procedure("Physical Exam", "Dr. Ardila", "10/06/2024", 3500.00);
        Procedure procedure3 = new Procedure("MRI", "10/03/2024", "Dr. Taylor", 1000.00); 
        
        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);
        
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total charge: $%,.2f\n", totalCharges);
        System.out.println("\n");
        System.out.print("\nStudent Name:");
        String studentName = scanner.nextLine();
        System.out.print("MC#: ");
        String mcNumber = scanner.nextLine();
        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();
        
        scanner.close();
    }

    
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
        System.out.println();
        System.out.println();
    }

    public static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3) {
        return proc1.getProcedureCharge() + proc2.getProcedureCharge() + proc3.getProcedureCharge();
    }
}
