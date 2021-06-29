package com.example.authontication.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.authontication.model.Event;

@Repository
public interface EventRepo extends CrudRepository<Event, Long>{
	ArrayList<Event> findByState(String state);
	@Query(value="SELECT * FROM events WHERE state != ?1",nativeQuery=true)
	ArrayList<Event> findNotByState(String state);

}
