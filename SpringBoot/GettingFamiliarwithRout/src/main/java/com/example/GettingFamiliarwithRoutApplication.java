package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GettingFamiliarwithRoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(GettingFamiliarwithRoutApplication.class, args);
	}
	@RequestMapping("/coding")
    public String CodingController() {
        return "Hello Coding Dojo!" ;}
	@RequestMapping("/coding/python")
    public String CodingController2() {
        return "Python/Django was awesome!" ;}
	@RequestMapping("/coding/java")
    public String CodingController3() {
        return "Java/Spring is better!" ;}
	@RequestMapping("/{track}")
    public String DojoController(@PathVariable("track") String track){
    	return "The " + track+" is awesome!" ;
    }
	@RequestMapping("/test/{track}")
    public String DojoController2(@PathVariable("track") String track){
		String[] s = track.split("-");
		String one = s[0].substring(0,1).toUpperCase();
		String two = s[0].substring(1);
		String one1 = s[1].substring(0,1).toUpperCase();
		String two1 = s[1].substring(1);
		
    	return  one+two+" "+one1+two1+" is located in southern california" ;
    }
	@RequestMapping("/test2/{track}")
    public String DojoController3(@PathVariable("track") String track){
		String[] s = track.split("-");
		String one = s[0].substring(0,1).toUpperCase();
		String one1 = s[1].substring(0,1).toUpperCase();
		
    	return  one+one1+" Dojo is headquarters" ;
    }
	
}
