package com.example.authontication.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.authontication.model.Event;
import com.example.authontication.repository.EventRepo;

@Service
public class EventService {
	private EventRepo eventrepo;
	public EventService( EventRepo eventrepo) {
		this.eventrepo =  eventrepo;
	}
	
	public void create(Event event) {
		eventrepo.save(event);
	}
	
	public void update(Event event) {
		create(event);
	}
	public ArrayList<Event> all(){
		return (ArrayList<Event>)eventrepo.findAll();
	}
	
	public Event findById(Long id) {
		return eventrepo.findById(id).orElse(null);
	}
	
	public void destroy(Long id) {
		eventrepo.deleteById(id);
	}
	
	public ArrayList<Event> findByState(String state){
		return eventrepo.findByState(state);
	}
	
	public ArrayList<Event> findNotByState(String state){
		return eventrepo.findNotByState(state);
	}
}
