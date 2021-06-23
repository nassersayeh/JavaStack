package com.example.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.relationships.modelsPerson.License;
import com.example.relationships.modelsPerson.Person;
import com.example.relationships.repositories.LicensRepo;
import com.example.relationships.repositories.PersonRepo;

@Service
public class relationshipServices {
private final LicensRepo licensreposotory;
private final PersonRepo personreposotory;
public relationshipServices(LicensRepo licensreposotory,PersonRepo personreposotory) {
	this.personreposotory =personreposotory;
	this.licensreposotory = licensreposotory;
}
public LicensRepo getLicensreposotory() {
	return licensreposotory;
}
public PersonRepo getPersonreposotory() {
	return personreposotory;
}
public List<Person> allperson() {
    return personreposotory.findAll();
}
public List<License> alllicens() {
    return licensreposotory.findAll();
}
public Person createPerson(Person l) {
    return personreposotory.save(l);
}
public License createLicens(License l) {
    return licensreposotory.save(l);
}
public void deletePerson(Long id) {
	// TODO Auto-generated method stub
	personreposotory.deleteById(id);
	
}
public void deleteLicens(Long id) {
	// TODO Auto-generated method stub
	licensreposotory.deleteById(id);
	
}
public List<Person> getunlistedLicens(){
	return personreposotory.findByLicenseIdIsNull();
}
public Optional<License> getLicense(Long id) {
	return licensreposotory.findById(id);
}
}
