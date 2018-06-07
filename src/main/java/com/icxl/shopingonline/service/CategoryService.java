package com.icxl.shopingonline.service;

import java.util.List;

import com.icxl.shopingonline.model.Category;

public interface CategoryService {

	void save(Category category);
	
	List<Category> list();
	
	Category get(int id);
}
