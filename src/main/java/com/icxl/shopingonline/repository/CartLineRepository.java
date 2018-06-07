package com.icxl.shopingonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.icxl.shopingonline.model.CartLine;

public interface CartLineRepository extends JpaRepository<CartLine, Integer>{

	
	// fetch the CartLine based on cartId and productId
	@Query("SELECT e FROM CartLine e WHERE e.cartId = :cartId AND e.product.id = :productId")
	public CartLine getByCartAndProduct(int cartId, int productId);		
			
		
		// list of available cartLine
	@Query("SELECT e FROM CartLine e WHERE e.cartId = :cartId and e.available =true ")
	public List<CartLine> listAvailable(int cartId);
	
	@Query("SELECT e FROM CartLine e WHERE e.cartId = :cartId ")
	public List<CartLine> list(int cartId);
	
}
