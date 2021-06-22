package com.example.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Languages.Model.Language;
import com.example.Languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langserv;
	
	public LanguageController(LanguageService langserv) {
		this.langserv = langserv;
	}

	@RequestMapping("/language")
	public String lang(Model model, @ModelAttribute("Language")Language languages) {
		List<Language> languages1 = langserv.allLanguages();
		model.addAttribute("lang", languages1);
		return "/Home.jsp";
	}
	 @RequestMapping(value="/languages", method = RequestMethod.POST)
		public String create(@Valid @ModelAttribute("Language") Language languages, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/Home.jsp";
	        } else {
	        	langserv.createLanguage(languages);
	            return "redirect:/language";
	        }
	    }

		@RequestMapping(value="/language/{id}")
		public String delete(@PathVariable("id") Long id) {
			langserv.deleteLanguage(id);
			return "redirect:/language";
		}
	
		@RequestMapping("/language/edit/{id}")
		public String update(@PathVariable("id") Long id,@ModelAttribute("Language")Language languages,Model model) {
			Language lang = langserv.findLanguage(id);
			model.addAttribute("language",lang);
			return "/udapte.jsp";
		}
		@RequestMapping(value="/language/update/{id}", method = RequestMethod.POST)
		public String update(@Valid @ModelAttribute("Language") Language languages, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/udapte.jsp";
	        } else {
	        	langserv.updateBook(languages);
	            return "redirect:/language";
	        }
	    }
		
		@RequestMapping(value="/language/show/{id}")
		public String show(@PathVariable("id") Long id,Model model,@ModelAttribute("Language")Language languages) {
			Language lang = langserv.findLanguage(id);
			model.addAttribute("language",lang);
			return "/Show.jsp";
		}
	    
}
