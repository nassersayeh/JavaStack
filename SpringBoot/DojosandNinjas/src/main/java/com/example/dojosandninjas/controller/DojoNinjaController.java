package com.example.dojosandninjas.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.models.Ninja;
import com.example.dojosandninjas.services.DojoNinjaServices;

@Controller
public class DojoNinjaController {
private final DojoNinjaServices djservices;

public DojoNinjaController(DojoNinjaServices djservices) {
	this.djservices = djservices;
}

@RequestMapping("/dojo/new")
public String show(@ModelAttribute("dojo")Dojo dojo) {
	return "homepage.jsp";
}

@RequestMapping("/creatdojo")
public String creatdojo(@Valid @ModelAttribute("dojo") Dojo dojo , BindingResult result) {
	if(result.hasErrors()) {
		return "homepage.jsp";
	}
	Dojo p = djservices.creatDojo(dojo);
	return "redirect:/dojo/new";
}



@RequestMapping("/ninja/new")
public String showninja(@ModelAttribute("ninja")Ninja ninja , Model model ) {
	List <Dojo> x=djservices.findAllDojos();
	model.addAttribute("x",x);
	return "ninjapage.jsp";
}

@RequestMapping("/creatninja/{id}")
public String creatninja(@Valid @ModelAttribute("ninja") Ninja ninja , BindingResult result  ) {
	if(result.hasErrors()) {
		return "ninjapage.jsp";
	}
	
	Ninja n = djservices.creatNinja(ninja);
	return "redirect:/ninja/new";
}

@RequestMapping("/dojos/{id}")
public String show(@PathVariable("id") long id,Model model) {
	Dojo x=djservices.findDojoById(id);
	List <Ninja> xg=djservices.findAllByDojo(x);
	model.addAttribute("x",x);
	model.addAttribute("xg",xg);
	return "/dojos.jsp";
}
}
