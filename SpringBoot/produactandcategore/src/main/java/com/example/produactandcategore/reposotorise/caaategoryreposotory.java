package com.example.produactandcategore.reposotorise;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.produactandcategore.models.Category;
import com.example.produactandcategore.models.Product;
@Repository
public interface caaategoryreposotory extends CrudRepository<Category, Long> {

		List<Category> findAll();
		List<Category> findByProductsNotContains(Product product);

	}

	

