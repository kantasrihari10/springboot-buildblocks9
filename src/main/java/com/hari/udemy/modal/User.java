package com.hari.udemy.modal;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "user", schema = "udemy")
@JsonIgnoreProperties({"username","lastname"})
public class User  {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long userid;
	
	public User(Long userid,
			 String username,
			String lastname, String email, String role, String ssn, List<Order1> orders) {
		super();
		this.userid = userid;
		this.username = username;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
		this.orders = orders;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}


	@NotEmpty(message = "User name is Mandtory field. please provide username")
	@Column(name = "USER_NAME", length = 50, nullable = true, unique = true)
    private String username;
    @Column(name = "LAST_NAME", length = 50, nullable = false)
	@Size(min = 2, message = "Lastname atleast two charactors")
	private String lastname;
	@Column(name = "EMAIL", length = 50, nullable = false)
	private String email;
	@Size(min = 2)
	@Column(name = "ROLE", length = 50, nullable = false)
	private String role;
	
	@Column(name = "SSN", length = 50, nullable = false, unique = true)
	@JsonIgnore
	private String ssn;
 	@OneToMany(mappedBy ="user")
    private List<Order1> orders;
	
	public List<Order1> getOrders() {
		return orders;
	}

	public void setOrders(List<Order1> orders) {
		this.orders = orders;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public User() {
		super();

	}

}
