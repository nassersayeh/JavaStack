package com.example.authontication.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.authontication.model.Event;
import com.example.authontication.model.Message;
import com.example.authontication.model.User;
import com.example.authontication.services.EventService;
import com.example.authontication.services.MessageService;
import com.example.authontication.services.UserService;

@Controller
@RequestMapping("/events")
public class EventController {
	private UserService userservice;
	private EventService eventservice ;
	private MessageService messageservice;
	public EventController(EventService eventservice ,MessageService messageservice) {
		this.eventservice= eventservice ;
		this.messageservice=messageservice;
	}
	
	@RequestMapping("")
	public String events(@ModelAttribute("event") Event event, HttpSession session,Model model) {
		
		return"events.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("event") Event event, BindingResult result) {
		if(result.hasErrors()) {
			return"events";
		}else {
			eventservice.create(event);
		}
		return"redirect:/events";
	}
	
	@RequestMapping("/{id}")
	public String showEvent(@PathVariable("id")Long id,Model model,@ModelAttribute("message")Message message) {
		model.addAttribute("event",eventservice.findById(id));
		return "showEvent.jsp";
		
	}
	
	@PostMapping("/{id}/messages/new")
	public String comment(@ModelAttribute("message")Message message,BindingResult result,@PathVariable("id")Long event_id) {
		if(result.hasErrors()) {
			return"/events/"+event_id;
		}
		Event e=eventservice.findById(event_id);
		message.setEvent(e);
		messageservice.create(message);
		
		return "redirect:/events/"+event_id;
		
	}
}
