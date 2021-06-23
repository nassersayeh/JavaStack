package com.example.relationships.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.relationships.modelsPerson.License;
import com.example.relationships.modelsPerson.Person;
import com.example.relationships.services.relationshipServices;

@Controller
public class PersonController {
	private final relationshipServices realtionservice ;
	public PersonController(relationshipServices realtionservice) {
		this.realtionservice=realtionservice;
	}
	public relationshipServices getRealtionservice() {
		return realtionservice;
	}
	
	@RequestMapping("/person")
	public String show(Model model) {
		List<Person> person = realtionservice.allperson();
		model.addAttribute("persons",person);
		return "index1.jsp";
	}
	@RequestMapping("/licens")
	public String show2(Model model) {
		List<License> licens = realtionservice.alllicens();
		model.addAttribute("licens",licens);
		return "/licesnshome.jsp";
	}
	
	@RequestMapping("/person/newperson")
	public String newperson(@ModelAttribute("person")Person person) {
		return "/personform.jsp";
	}
	
	@RequestMapping(value="/person/add", method = RequestMethod.POST)
	public String createperson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/personform.jsp";
	    } else {
	    	realtionservice.createPerson(person);
	        return "redirect:/person";
	    }
	}
	
	
	@RequestMapping("/licens/newlicens")
	public String newLicens(@ModelAttribute("licens")License licens , Model model) {
		List<Person> person2 = realtionservice.getunlistedLicens();
		model.addAttribute("person",person2);
		return "/licensform.jsp";
	}
	
	@RequestMapping(value="/licens/add", method = RequestMethod.POST)
	public String createLicens(@Valid @ModelAttribute("licens") License licens, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/licensform.jsp";
	    } else {
	    	realtionservice.createLicens(licens);
	        return "redirect:/licens";
	    }
	}
	
	@RequestMapping("/persons/{id}")
	public String viewDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", realtionservice.getLicense(id).get());
		return "view.jsp";
	}
}
