package com.icxl.shopingonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icxl.shopingonline.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{

}
