package com.hari.udemy.modal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Order1  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderid;
	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

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