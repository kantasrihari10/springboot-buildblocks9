package com.hari.udemy.modal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Order1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String orderNAme;
	private String city;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
	private User user;
   
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNAme() {
		return orderNAme;
	}

	public void setOrderNAme(String orderNAme) {
		this.orderNAme = orderNAme;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}