package com.icxl.shopingonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icxl.shopingonline.model.Product;
import com.icxl.shopingonline.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProductsByParam(String param, int maxResultsCount) {
		System.out.println("..getProductsByParam  = "+param +" ..maxResultsCount "+maxResultsCount);
		Pageable topN = new PageRequest(0, maxResultsCount);
		List<Product>  ls =  productRepository.getProductsByParam(param, topN);
		
		System.out.println(ls);
		for (int i = 0; i < ls.size(); i++) {
			Product p =ls.get(i);
			System.out.println(" product name  = "+p.getName());
		}
		
		return ls;
	}

	@Override
	public List<Product> listActiveProducts() {
		return productRepository.listActiveProducts();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		return productRepository.listActiveProductsByCategory(categoryId);
	}

	@Override
	public List<Product> getLatestActiveProducts(int maxResultsCount) {
		Pageable topN = new PageRequest(0, maxResultsCount);
		return productRepository.getLatestActiveProducts(topN);
	}

	@Override
	@Transactional
	public Product get(int productId) {
		return productRepository.getOne(productId);
	}

	@Override
	public List<Product> list() {
		return productRepository.findAll();
	}

	@Override
	@Transactional
	public Product add(Product product) {
		return productRepository.save(product);
	}

	@Override
	@Transactional
	public Product update(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void delete(Product product) {
		 productRepository.delete(product);;
	}

}
