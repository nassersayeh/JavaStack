package com.example.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.models.Book;
import com.example.services.BookService;

@Controller
public class BooksController {
	private final BookService langserv;
	public BooksController(BookService langserv){
		this.langserv = langserv;
	}
	@RequestMapping("/show")
	public String show(Model model) {
		List<Book> book = langserv.allBooks();
		model.addAttribute("books",book);
		return "/shows.jsp";
	}
	 @RequestMapping("/books/new")
	    public String newBook(@ModelAttribute("book") Book book) {
	        return "/new.jsp";
	    }
	    @RequestMapping(value="/books", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/new.jsp";
	        } else {
	        	langserv.createBook(book);
	            return "redirect:/show";
	        }
	    }
	    @RequestMapping(value="/book/{id}")
		public String Show(@PathVariable("id") Long id,Model model) {
			Book book = langserv.findBook(id);
			model.addAttribute("book",book);
			return "/book.jsp";
		}
}
