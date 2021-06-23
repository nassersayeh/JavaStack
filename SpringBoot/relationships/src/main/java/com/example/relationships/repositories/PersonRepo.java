package com.example.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.relationships.modelsPerson.Person;
@Repository
public interface PersonRepo extends CrudRepository<Person, Long>{
	List<Person> findAll();
	List<Person> findByLicenseIdIsNull();
 
}
