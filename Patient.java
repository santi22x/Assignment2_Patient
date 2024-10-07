/*
 * Class: CMSC203 
 * Instructor: David Kujit
 * Description: (Give a brief description for each Class)
 * Due: 10/06/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Santiago Ardila
*/

public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNum;
	private String emergencyContactName;
	private String emergencyContactNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Patient() {
    }
	public Patient(String firstName,String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Patient(String firstName,String middleName, String lastName,String street, String city, String state, String zipCode, String phoneNum, String emergencyContactName,String emergencyContactNum) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.emergencyContactName = emergencyContactName;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNum = phoneNum;
		this.emergencyContactNum = emergencyContactNum;	
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	public String getEmergencyContactNum() {
		return emergencyContactNum;
	}
	public void setEmergencyContactNum(String emergencyContactNum) {
		this.emergencyContactNum = emergencyContactNum;
	}
	
	public String buildAddress() {
		return street + " " + city + " " + state + " " + zipCode;
	}
	public String buildEmergency() {
		return emergencyContactName + " " + emergencyContactNum;
	}
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	public String toString() {
		return "\nPatient info: \n  Name: "+ buildFullName()
		+ "\n  Address: "+ buildAddress() +
		"\n  EmergencyContact: " + buildEmergency();
	}
	

}

