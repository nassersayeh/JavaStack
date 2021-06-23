package com.example.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.relationships.modelsPerson.License;
@Repository
public interface LicensRepo extends CrudRepository<License, Long> {
	List<License> findAll();
	List<License> findTopByOrderByNumberDesc();
}
