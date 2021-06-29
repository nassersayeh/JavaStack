package com.example.authontication.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.authontication.model.Message;
import com.example.authontication.repository.MessageRepo;

@Service
public class MessageService {
	
	private MessageRepo messagerepo;
	
	public MessageService(MessageRepo messagerepo) {
		this.messagerepo =  messagerepo;
	}
	
	public void create(Message message) {
		messagerepo.save(message);
	}
	
	public void update(Message message) {
		create(message);
	}
	public ArrayList<Message> all(){
		return (ArrayList<Message>)messagerepo.findAll();
	}
	
	public Message findById(Long id) {
		return messagerepo.findById(id).orElse(null);
	}
	
	public void destroy(Long id) {
		messagerepo.deleteById(id);
	}
	
}
