package com.icxl.shopingonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.icxl.shopingonline.model.Address;
import com.icxl.shopingonline.model.User;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	// adding and updating a new address
	@Query("SELECT e FROM Address e WHERE e.userId =:userId")
	Address getBillingAddress(@Param("userId") int userId);
		
	
	@Query("SELECT e FROM Address e WHERE e.userId =:userId")
	List<Address> listShippingAddresses(@Param("userId") int userId);
}
