package com.icxl.shopingonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icxl.shopingonline.model.Address;
import com.icxl.shopingonline.model.User;
import com.icxl.shopingonline.repository.AddressRepository;
import com.icxl.shopingonline.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public User getByEmail(String email) {
		return userRepository.getByEmail(email);
	}

	@Override
	public Address getBillingAddress(int userId) {
		return addressRepository.getBillingAddress(userId);
	}

	@Override
	public List<Address> listShippingAddresses(int userId) {
		return addressRepository.listShippingAddresses(userId);
	}

	@Override
	public User get(int userId) {
		return userRepository.findOne(userId);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Address getAddressById(int addressId) {
		return addressRepository.findOne(addressId);
	}

	@Override
	public void saveAddress(Address address) {
		addressRepository.save(address);
	}

}
