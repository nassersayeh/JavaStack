package com.example.authontication.controller;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.authontication.model.User;
import com.example.authontication.services.UserService;


// imports removed for brevity
@Controller
public class userController {
    private final UserService userService;
    
    public userController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	if(user.getPasswordConfirmation().equals(user.getPassword())) {
            userService.registerUser(user);
            session.setAttribute("user.id", user.getId());
            return "redirect:/home";
        	}
    	else
    		return "redirect:/registeration";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if(userService.authenticateUser(email, password)==true) {
    		User user=userService.findByEmail(email);
    		session.setAttribute("user.id", user.getId());
    		return "redirect:/home";
    		
    	}
    	else {
    		return "redirect:/login";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {

    	Long userid=(Long) session.getAttribute("user.id");
    	User user=userService.findUserById(userid);
    	model.addAttribute(user);
    	return "/homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.removeAttribute("user.id");
    	return "redirect:/login";
    }
}