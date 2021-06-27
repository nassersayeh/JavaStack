package com.example.produactandcategore.reposotorise;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.produactandcategore.models.Category;
import com.example.produactandcategore.models.Product;

public interface Productreposotory extends CrudRepository<Product, Long>{
	
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);

}
