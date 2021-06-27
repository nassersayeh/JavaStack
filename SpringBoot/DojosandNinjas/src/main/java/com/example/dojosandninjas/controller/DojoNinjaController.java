package com.example.dojosandninjas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dojosandninjas.services.DojoNinjaServices;

@Controller
public class DojoNinjaController {
private final DojoNinjaServices djservices;

public DojoNinjaController(DojoNinjaServices djservices) {
	this.djservices = djservices;
}

@RequestMapping("/")
public String show() {
	return "homepage.jsp";
}

public DojoNinjaServices getDjservices() {
	return djservices;
}

}
