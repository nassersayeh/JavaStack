package com.example;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dojoservy {
@RequestMapping(value ="/main",method=RequestMethod.POST)
public String index(HttpSession session ,@RequestParam(value="yourname") String yourname,@RequestParam(value="selectone") 
String selectone,@RequestParam(value="Programming") String Programming,@RequestParam(value="textbox") String textbox) {
	session.setAttribute("name", yourname);
	session.setAttribute("location", selectone);
	session.setAttribute("lang", Programming);
	session.setAttribute("comment", textbox);
	return "redirect:/home";
	
}
@RequestMapping("/")
public String index3() {
return "MainForm.jsp";
}
@RequestMapping("/home")
public String index2(HttpSession session) {
	return "Home.jsp";
}

}
