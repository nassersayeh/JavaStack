package com.example.Languages.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Languages.Model.Language;
import com.example.Languages.services.LanguageService;
@RestController
public class LanguageApi {
		 private final LanguageService languageService;
		    public LanguageApi(LanguageService languageService){
		        this.languageService = languageService;
		    }
		    // other methods removed for brevity
		    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
		    public Language update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="creator") String create, @RequestParam(value="vertion") String version) {
		        Language language = languageService.updateBook(id, title, create, version);
		        return language;
		    }
		    
		    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
		    public void destroy(@PathVariable("id") Long id) {
		    	languageService.deleteLanguage(id);
		    }
	}

