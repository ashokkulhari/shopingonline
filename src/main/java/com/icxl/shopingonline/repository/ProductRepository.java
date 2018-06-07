package com.icxl.shopingonline.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.icxl.shopingonline.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT e FROM Product e WHERE e.active =true ORDER BY :param DESC ")
	List<Product> getProductsByParam(String param, Pageable pageable);	
	
		
	@Query("SELECT e FROM Product e WHERE e.active =true")
	List<Product> listActiveProducts();	
	
	@Query("SELECT e FROM Product e WHERE e.active =true and e.categoryId =:categoryId")
	List<Product> listActiveProductsByCategory(@Param("categoryId") int categoryId);
	
	@Query("SELECT e FROM Product e WHERE e.active =true ORDER BY id")
	List<Product> getLatestActiveProducts(Pageable pageable);
	
}
