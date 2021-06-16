package com.example;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	int count1=0;
	@RequestMapping("/counter")
	public String index(HttpSession session){
        session.setAttribute("count", count1++);
        return "Page1.jsp";
    }
	@RequestMapping("/")
	public String index2(HttpSession session){
        return "Page2.jsp";
    }

}
