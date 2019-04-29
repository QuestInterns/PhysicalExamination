package me.salisuwy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRespository;


    @GetMapping("/Patients")
    public List<Patient> findAll()
    {
    	return patientRespository.findAll();
    }
    
    @GetMapping("/Patients/{id}")
    public List<Patient> show(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return patientRespository.findById(pID);
    }
    
  @PutMapping("/Patients/{id}")
  public Patient update(@PathVariable String id, @RequestBody Map<String, String> body){
      	int patientId = Integer.parseInt(id);
      	Patient patient = patientRespository.findOne(patientId);
      	patient.setPatientId(Integer.parseInt(body.get("PatientID")));
	  	patient.setPatientRef(body.get("PatientRef"));
	  	patient.setPatientType(body.get("PatientType"));
	  	patient.setCompanyName(body.get("Companyname"));
	  	patient.setPosition(body.get("Position"));
	  	patient.setFirstName(body.get("FirstName"));
	  	patient.setMiddleName(body.get("MiddleName"));
	  	patient.setLastName(body.get("LastName"));
	  	patient.setAddress(body.get("Address"));
	  	patient.setBirthdate(body.get("BirthDate"));
	  	patient.setEmail(body.get("Email"));
	  	patient.setAge(body.get("Age"));
	  	patient.setContactNo(body.get("ContactNo"));
	  	patient.setPatientBiller(body.get("PatientBiller"));
	  	patient.setNotes(body.get("Notes"));
	  	patient.setSid(body.get("SID"));
	  	patient.setCreationDate(body.get("CreationDate"));
	  	patient.setDateUpdate(body.get("DateUpdate"));
	  	return patientRespository.save(patient);
  }
    
    @PostMapping("/Patients")
    	public Patient create(@RequestBody Map<String, String> body){
    	int patientId = Integer.parseInt(body.get("PatientID"));
    	String patientRef = body.get("PatientRef");
    	String patientType = body.get("PatientType");
    	String companyName = body.get("Companyname");
    	String position = body.get("Position");
    	String firstName = body.get("FirstName");
    	String middleName = body.get("MiddleName");
    	String lastName = body.get("LastName");
    	String address = body.get("Address");
    	String birthDate = body.get("BirthDate");
    	String email = body.get("Email");
    	String age = body.get("Age");
    	String contactNo = body.get("ContactNo");
    	String patientBiller = body.get("PatientBiller");
    	String notes = body.get("Notes");
    	String sid = body.get("SID");
    	String creationDate = body.get("CreationDate");
    	String dateUpdate = body.get("DateUpdate");
    	return patientRespository.save(new Patient(patientId, patientRef, patientType, companyName, position, firstName, middleName, lastName, address, birthDate, email, age, contactNo, patientBiller, notes, sid, creationDate, dateUpdate));
    }


}