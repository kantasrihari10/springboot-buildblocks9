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

@Entity
@Table(name = "user", schema = "udemy")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
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
	private String ssn;
 	@OneToMany(mappedBy ="user")
    private List<Order1> orders;
	
	public List<Order1> getOrders() {
		return orders;
	}

	public void setOrders(List<Order1> orders) {
		this.orders = orders;
	}

	public User(Long id, String username, String lastname, String email, String role, String ssn) {
		super();
		this.id = id;
		this.username = username;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", lastname=" + lastname + ", email=" + email + ", role="
				+ role + ", ssn=" + ssn + "]";
	}

	public User() {
		super();

	}

}
