package com.hari.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.udemy.modal.Order1;

public interface OrderRepository extends JpaRepository<Order1, Long> {

}
