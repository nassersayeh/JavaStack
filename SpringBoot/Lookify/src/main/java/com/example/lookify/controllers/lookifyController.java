package com.example.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lookify.models.lookifyModel;
import com.example.lookify.services.*;
@Controller
public class lookifyController {
private final lookifyService lookifyService;
public lookifyController(lookifyService lookifyService) {
	this.lookifyService = lookifyService;
}
@RequestMapping("/")
public String show() {
	return "/home.jsp";
}
@RequestMapping("/dashboard")
public String dashboard(Model model) {
	List<lookifyModel> songs = lookifyService.allsong();
	model.addAttribute("songs",songs);
	return "/dashboard.jsp";
}
@RequestMapping("/newsong")
public String newsong(@ModelAttribute("lookify")lookifyModel lookify) {
	return "/songform.jsp";
}
@RequestMapping(value="/addsong", method = RequestMethod.POST)
public String create(@Valid @ModelAttribute("lookify") lookifyModel lookify, BindingResult result) {
    if (result.hasErrors()) {
        return "/songform.jsp";
    } else {
    	lookifyService.createSong(lookify);
        return "redirect:/dashboard";
    }
}
@RequestMapping("/delete/{id}")
public String delete(@PathVariable("id") Long id) {
	lookifyService.deleteLookify(id);
	return "redirect:/dashboard";
}
@RequestMapping("/song/{id}")
public String songPage(Model model,@PathVariable("id") Long id) {
	lookifyModel songs = lookifyService.findsong(id);
	model.addAttribute("songs",songs);
	return "/songpage.jsp";
}


@RequestMapping("/search/topTen")
public String top10(Model model) {
	List <lookifyModel>  x= lookifyService.topTen();
	model.addAttribute("music",x);
	return "/topten.jsp";
}
@RequestMapping("/search")
public String search(@RequestParam(value="name") String name,Model model) {
	lookifyModel x=lookifyService.searchByArtist(name);
   if(x.getArtist()!=null) {
	   List <lookifyModel> g=lookifyService.findByName(x.getArtist());
	   model.addAttribute("x",x);
	   model.addAttribute("g",g);
   	   return "/artist.jsp";
   }
   
	   return "redirect:/";
   
}
}
