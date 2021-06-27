package com.example.produactandcategore.controller;

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

import com.example.produactandcategore.models.Category;
import com.example.produactandcategore.models.Product;
import com.example.produactandcategore.services.ProCatService;
@Controller
public class ProCatController {
	private final ProCatService proCatService;

	public ProCatController(ProCatService procatservice) {
		this.proCatService = procatservice;
	}

	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "creatproduct.jsp";
	}
	@RequestMapping(value="/product" , method = RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("product") Product product , BindingResult result) {
		if(result.hasErrors()) {
			return "creatproduct.jsp";
		}
		Product p = proCatService.CreatProduct(product);
		return "redirect:/products/new";
	}
	
	
	
	
	@RequestMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "creatcategory.jsp";
	}
	@RequestMapping(value="/category" , method = RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category") Category category , BindingResult result) {
		if(result.hasErrors()) {
			return "creatcategory.jsp";
		}
		Category c = proCatService.CreatCategory(category);
		return "redirect:/category/new";
	}
	
	
	
	@RequestMapping("/products/{id}")
	public String showProducts(Model model , @PathVariable("id")Long id) {
		Product p = proCatService.findOneProduct(id);
		model.addAttribute("product",p);
		List<Category> unlisted = proCatService.allCatigoriesExeptProduct(p);
		model.addAttribute("unlisted",unlisted);
		return "showproduct.jsp";
		
	}
	
	@RequestMapping("/addcategory/{id}")
	public String addCategories(@PathVariable("id") Long pro_id,@RequestParam("categorylist")Long cat_id) {
		
		 proCatService.add(pro_id,cat_id);
		 return "redirect:/products/"+pro_id;
	}
	
	@RequestMapping("/category/{id}")
	public String showCategory(Model model , @PathVariable("id")Long id) {
		Category c = proCatService.findOneCategory(id);
		model.addAttribute("category", c);
		List<Product> unlisted = proCatService.allProductExeptCategory(c);
		model.addAttribute("unlisted", unlisted);
		return "showcategory.jsp";
	}
	
	@RequestMapping("/addproduct/{id}")
	public String addProduct(@PathVariable("id")Long cat_id,@RequestParam("productlist")Long pro_id) {
		proCatService.addCat(cat_id, pro_id);
		return"redirect:/category/"+cat_id;
	}
}
