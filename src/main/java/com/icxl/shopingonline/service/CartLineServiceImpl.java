package com.icxl.shopingonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icxl.shopingonline.model.Cart;
import com.icxl.shopingonline.model.CartLine;
import com.icxl.shopingonline.model.OrderDetail;
import com.icxl.shopingonline.repository.CartLineRepository;
import com.icxl.shopingonline.repository.CartRepository;
import com.icxl.shopingonline.repository.OrderDetailRepository;

@Service
public class CartLineServiceImpl implements CartLineService{

	@Autowired
	private CartLineRepository cartLineRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public List<CartLine> list(int cartId) {
		return cartLineRepository.list(cartId);
	}

	@Override
	public CartLine get(int id) {
		return cartLineRepository.getOne(id);
	}

	@Override
	public void saveCartLine(CartLine cartLine) {
		cartLineRepository.save(cartLine);
	}

	@Override
	public boolean remove(CartLine cartLine) {
		cartLineRepository.delete(cartLine);
		return true;
	}

	@Override
	public CartLine getByCartAndProduct(int cartId, int productId) {
		return cartLineRepository.getByCartAndProduct(cartId, productId);
	}

	@Override
	public boolean updateCart(Cart cart) {
		cartRepository.save(cart);
		return false;
	}

	@Override
	public List<CartLine> listAvailable(int cartId) {
		return cartLineRepository.listAvailable(cartId);
	}

	@Override
	public boolean addOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.save(orderDetail);
		return false;
	}

}
