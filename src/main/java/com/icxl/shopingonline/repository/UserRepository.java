package com.icxl.shopingonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.icxl.shopingonline.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("SELECT e FROM User e WHERE e.email =:email")
	User getByEmail(@Param("email") String email);
	
}
