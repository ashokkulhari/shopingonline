package com.icxl.shopingonline.service;

import java.util.List;

import com.icxl.shopingonline.model.Cart;
import com.icxl.shopingonline.model.CartLine;
import com.icxl.shopingonline.model.OrderDetail;


public interface CartLineService {

	
	public List<CartLine> list(int cartId);
	public CartLine get(int id);	
	public void saveCartLine(CartLine cartLine);
	public boolean remove(CartLine cartLine);
	
	// fetch the CartLine based on cartId and productId
	public CartLine getByCartAndProduct(int cartId, int productId);		
		
	// updating the cart
	boolean updateCart(Cart cart);
	
	// list of available cartLine
	public List<CartLine> listAvailable(int cartId);
	
	// adding order details
	boolean addOrderDetail(OrderDetail orderDetail);
}
