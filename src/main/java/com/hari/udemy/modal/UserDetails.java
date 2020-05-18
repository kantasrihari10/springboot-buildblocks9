package com.hari.udemy.modal;

public class UserDetails {
	

	/**
	 * @param firstNAme
	 * @param lastName
	 * @param city
	 */
	public UserDetails(String firstNAme, String lastName, String city) {
		super();
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.city = city;
	}
	private String firstNAme;
	private String lastName;
	private String city;
	public String getFirstNAme() {
		return firstNAme;
	}
	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserDetails [firstNAme=" + firstNAme + ", lastName=" + lastName + ", city=" + city + "]";
	}
}
