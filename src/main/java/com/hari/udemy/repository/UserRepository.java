package com.hari.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.udemy.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username); 

}
