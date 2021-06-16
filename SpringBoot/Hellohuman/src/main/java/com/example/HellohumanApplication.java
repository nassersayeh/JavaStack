package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	@RestController
	public class HomeController {
	    @RequestMapping("/")
	    public String index(){
	      return "<h1>Hello Human!</h1> <br> <p>welcome to our spring boot</p>";
	    }
	    @RestController
	    public class HomeController2{
	        @RequestMapping("/grating")
	        public String index(@RequestParam(value="q") String searchQuery) {
	            return "<a href='#' style=margin-left:90%> back </a><h1>Hello "+searchQuery+"!</h1> <br>"+" <p>welcome to our spring boot</p>  " ;
	        }
	    }
}
}
