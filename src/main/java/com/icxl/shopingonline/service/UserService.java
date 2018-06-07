package com.icxl.shopingonline.service;

import java.util.List;


import com.icxl.shopingonline.model.Address;
import com.icxl.shopingonline.model.User;

public interface UserService {

	User getByEmail(String email);
	User get(int userId);
	void saveUser(User user);
	
	Address getAddressById( int addressId);
	
	void saveAddress(Address address);
	
	Address getBillingAddress( int userId);
	
	List<Address> listShippingAddresses(int userId);
}
