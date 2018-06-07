package com.icxl.shopingonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icxl.shopingonline.model.Category;
import com.icxl.shopingonline.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
    private CategoryRepository categoryRepository;

	@Override
	public List<Category> list() {
		return categoryRepository.findAll();
	}

	@Override
	public Category get(int id) {
		return categoryRepository.findOne(id);
	}

	@Override
	public void save(Category category) {
		categoryRepository.save(category);
	}
}
