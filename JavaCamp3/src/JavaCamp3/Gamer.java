package JavaCamp3;

public class Gamer {
private String firstName;
private String lastName;
private int birthDay;
private String identityNumber;
public Gamer(String firstName, String lastName, int birthDay, String identityNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDay = birthDay;
	this.identityNumber = identityNumber;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getBirthDay() {
	return birthDay;
}
public void setBirthDay(int birthDay) {
	this.birthDay = birthDay;
}
public String getIdentityNumber() {
	return identityNumber;
}
public void setIdentityNumber(String identityNumber) {
	this.identityNumber = identityNumber;
}
}
