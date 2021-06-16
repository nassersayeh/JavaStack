package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Assigment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assigment1Application.class, args);
	}
	@RequestMapping("/")
public String Home() {
	return "index.jsp";
}
	@RequestMapping("/date")
public String Home2(Model model) {
		java.util.Date date=new java.util.Date();  
  
	model.addAttribute("Date",date );
	return "index2.jsp";
}
	@RequestMapping("/time")
public String Home3(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    	String dateString = dateFormat.format(new Date()).toString();
		model.addAttribute("time" ,dateString);
	return "index3.jsp";
}
}
