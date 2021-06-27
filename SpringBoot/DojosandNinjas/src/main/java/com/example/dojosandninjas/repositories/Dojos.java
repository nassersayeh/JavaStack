package com.example.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dojosandninjas.models.Dojo;

@Repository
public interface Dojos extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
}
