package com.example.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.models.Ninja;
@Repository
public interface Ninjas extends CrudRepository<Ninja,Long> {
	
	List<Ninja> findAll();
	

}
