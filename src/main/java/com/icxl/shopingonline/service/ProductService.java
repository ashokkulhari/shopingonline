package com.icxl.shopingonline.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.icxl.shopingonline.model.Product;


public interface ProductService {

	
	Product get(int productId);
	List<Product> list();	
	Product add(Product product);
	Product update(Product product);
	void delete(Product product);
	
	
	List<Product> getProductsByParam(String param, int maxResultsCount);	
	
	
	// business methods
	List<Product> listActiveProducts();	
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int maxResultsCount);
}
