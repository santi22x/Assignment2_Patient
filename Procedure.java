/*
 * Class: CMSC203 
 * Instructor: David Kujit
 * Description: (Give a brief description for each Class)
 * Due: 10/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Santiago Ardila
*/

public class Procedure {
	private String nameOfProcedure;
	private String dateOfProcedure;//In MM/DD/YYYY format
	private String nameOfPracticioner;
	private double procedureCharge;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Procedure() {
    }
	public Procedure(String nameOfProcedure,String dateOfProcedure) {
		this.nameOfProcedure = nameOfProcedure;
		this.dateOfProcedure = dateOfProcedure;
	}
	public Procedure(String nameOfProcedure,String dateOfProcedure, String nameOfPracticioner, double procedureCharge) {
		this.nameOfProcedure = nameOfProcedure;
		this.dateOfProcedure = dateOfProcedure;
		this.nameOfPracticioner = nameOfPracticioner;
		this.procedureCharge = procedureCharge;
	}

	public String getNameOfProcedure() {
		return nameOfProcedure;
	}

	public void setNameOfProcedure(String nameOfProcedure) {
		this.nameOfProcedure = nameOfProcedure;
	}

	public String getDateOfProcedure() {
		return dateOfProcedure;
	}

	public void setDateOfProcedure(String dateOfProcedure) {
		this.dateOfProcedure = dateOfProcedure;
	}

	public String getNameOfPracticioner() {
		return nameOfPracticioner;
	}

	public void setNameOfPracticioner(String nameOfPracticioner) {
		this.nameOfPracticioner = nameOfPracticioner;
	}

	public double getProcedureCharge() {
		return procedureCharge;
	}

	public void setProcedureCharge(double procedureCharge) {
		this.procedureCharge = procedureCharge;
	}
	
	public String toString() {
		return "\tProcedure: " + nameOfProcedure + "\n" +
		           "\tProcedureDate=" + dateOfProcedure + "\n" + 
		           "\tPractitioner=" + nameOfPracticioner + "\n" +
		           "\tCharge=" + procedureCharge;
	}
	
}
