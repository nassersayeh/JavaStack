package com.example.produactandcategore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.produactandcategore.models.Category;
import com.example.produactandcategore.models.Product;
import com.example.produactandcategore.reposotorise.Productreposotory;
import com.example.produactandcategore.reposotorise.caaategoryreposotory;
@Service
public class ProCatService {
private final caaategoryreposotory categoryrepo;
private final Productreposotory productrepo;
public ProCatService(caaategoryreposotory categoryrepo, Productreposotory productrepo) {
	this.categoryrepo = categoryrepo;
	this.productrepo = productrepo;
}

public Product CreatProduct(Product product) {
	
	return productrepo.save(product);
	
}

public Category CreatCategory(Category category) {
	return categoryrepo.save(category);
}

public List<Product> findAllProduct(){
	return productrepo.findAll();
}

public List<Category> findAllCategory(){
	
	return categoryrepo.findAll();
}

public Product findOneProduct(Long id) {
	Optional<Product> optinalproduct = productrepo.findById(id);
	if(optinalproduct.isPresent()) {
		return optinalproduct.get();
	}else {
		return null;
	}
	
}

public Category findOneCategory(Long id) {
	Optional<Category> optinalCategory = categoryrepo.findById(id);
	if(optinalCategory.isPresent()) {
		return optinalCategory.get();
	}else {
		return null;
	}
	
}

public List<Category> allCatigoriesExeptProduct(Product p){
	return categoryrepo.findByProductsNotContains(p);
}
public List<Product> allProductExeptCategory(Category y){
	return productrepo.findByCategoriesNotContains(y);
}

public Product add(Long pro_id, Long cat_id) {
	Product p =productrepo.findById(pro_id).orElse(null);
	Category c = categoryrepo.findById(cat_id).orElse(null);
	List<Category> cat = p.getCategories();
	cat.add(c);
	p.setCategories(cat);
	
	return productrepo.save(p);
}

public Category addCat(Long cat_id,Long pro_id) {
	Product p =productrepo.findById(pro_id).orElse(null);
	Category c = categoryrepo.findById(cat_id).orElse(null);
	List<Product> pro = c.getProducts();
	pro.add(p);
	c.setProducts(pro);
	
	return categoryrepo.save(c);

}

}
