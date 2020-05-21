package com.hari.udemy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.udemy.exceptions.UserNotFoundException;
import com.hari.udemy.modal.Order1;
import com.hari.udemy.modal.User;
import com.hari.udemy.repository.OrderRepository;
import com.hari.udemy.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class OrderController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/{userid}/orders")
	public List<Order1> getAllOrders(@PathVariable Long userid) throws UserNotFoundException {
		Optional<User> useroptional = userRepository.findById(userid);
		if (!useroptional.isPresent()) {
			throw new UserNotFoundException("user Not Found");
		}

		return useroptional.get().getOrders();

	}

	// create order
	@PostMapping("/{userid}/orders")
	public Order1 createOrder(@PathVariable Long userid, @RequestBody Order1 order1) throws UserNotFoundException {
		Optional<User> optionaluser = userRepository.findById(userid);

		if (!optionaluser.isPresent()) {
			throw new UserNotFoundException("user not found ok");
		}
		User user = optionaluser.get();

		order1.setUser(user);

		return orderRepository.save(order1);

	}
	
	@GetMapping("/{userid}/orders/{id}")
	public Order1 getOrderByOrderId(@PathVariable("userid") Long userid,@PathVariable("id") Long id) throws UserNotFoundException
	{
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkk");
		
		  Optional<User> optionaluser=userRepository.findById(userid);
		  if(!optionaluser.isPresent()) { throw new
		  UserNotFoundException("user not found ok"); }
		  
		  User user= optionaluser.get(); List<Order1> list=user.getOrders();
		  
		  Optional<Order1> order1= orderRepository.findById(id);
		  if(!order1.isPresent()) { throw new
		  UserNotFoundException("order not found ok"); } Order1 order2= order1.get();
		
		 for(Order1 order:list)
		 {
			 if(order.getId()==id)
			 { 
				 System.out.println("success");
			 }
	}
		 
		  
		 return order2;
		
	}
	

}
