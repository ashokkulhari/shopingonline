package com.icxl.shopingonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icxl.shopingonline.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
