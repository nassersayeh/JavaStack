package com.example.Languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.Languages.Model.Language;
import com.example.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	// adding the book repository as a dependency
	 private final LanguageRepository languageRepository;
	 
	 public LanguageService(LanguageRepository languageRepository) {
	     this.languageRepository = languageRepository;
	 }
	 // returns all the books
		public List<Language> allLanguages() {
	     return languageRepository.findAll();
	 }
	 // creates a book
	 public Language createLanguage(Language l) {
	     return languageRepository.save(l);
	 }
	 // retrieves a book
	 public Language findLanguage(Long id) {
	     Optional<Language> optionalLanguage = languageRepository.findById(id);
	     if(optionalLanguage.isPresent()) {
	         return optionalLanguage.get();
	     } else {
	         return null;
	     }
	 }
	public Language updateBook(Long id, String title, String creator, String version) {
		// TODO Auto-generated method stub
		Language l = this.findLanguage(id);
		l.setId(id);
		l.setCreator(creator);
		l.setTitle(title);
		l.setVirsion(version);
		return languageRepository.save(l);
	}
	public void deleteLanguage(Long id) {
		// TODO Auto-generated method stub
		languageRepository.deleteById(id);
		
	}
	public void updateBook(@Valid Language languages) {
		// TODO Auto-generated method stub
		languageRepository.save(languages);
		
	}
	 
}
