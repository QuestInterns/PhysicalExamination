package me.salisuwy;

import javax.persistence.*;

@Entity @Table(name="qpd_patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PatientID")
    private int patientId;

	@Column(name="PatientRef")
    private String patientRef;
    @Column(name="PatientType")
    private String patientType;
    @Column(name="CompanyName")
    private String companyName;
	@Column(name="Position")
    private String position;
	@Column(name="LastName")
    private String lastName;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="MiddleName")
    private String middleName;
//    @Column(name="fullname")
//    private String fullname;
	@Column(name="Address")
    private String address;
	@Column(name="Birthdate")
    private String birthdate;
	@Column(name="Email")
    private String email;
	@Column(name="Age")
    private String age;
	@Column(name="Gender")
    private String gender;
	@Column(name="ContactNo")
    private String contactNo;
	@Column(name="PatientBiller")
    private String patientBiller;
	@Column(name="Notes")
    private String notes;
	@Column(name="SID")
    private String sid;
	@Column(name="CreationDate")
    private String creationDate;
	@Column(name="DateUpdate")
    private String dateUpdate;
	
	public Patient() {  }

    public Patient(int patientID, String patientRef, String patientType, String companyName, String position, String firstName, String middleName, String lastName, String address, String birthDate, String mail, String age, String contactNo, String patientBiller, String notes, String sid, String creationDate, String dateUpdate)
    {
    	this.setPatientId(patientID);
        this.setPatientRef(patientRef);
        this.setPatientType(patientType);
        this.setCompanyName(companyName);
        this.setPosition(position);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMiddleName(middleName);
       // this.setFullname(lastName + ", " + firstName + " " + middleName);
        this.setAddress(address);
        this.setBirthdate(birthdate);
        this.setEmail(email);
        this.setAge(age);
        this.setGender(gender);
        this.setContactNo(contactNo);
        this.setPatientBiller(patientBiller);
        this.setNotes(notes);
        this.setSid(sid);
        this.setCreationDate(creationDate);
        this.setDateUpdate(dateUpdate);
    }
	
    public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientRef() {
		return patientRef;
	}
	public void setPatientRef(String patientRef) {
		this.patientRef = patientRef;
	}
	public String getPatientType() {
		return patientType;
	}
	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
//	public String getFullname() {
//		return fullname;
//	}
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getPatientBiller() {
		return patientBiller;
	}
	public void setPatientBiller(String patientBiller) {
		this.patientBiller = patientBiller;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

   
}
