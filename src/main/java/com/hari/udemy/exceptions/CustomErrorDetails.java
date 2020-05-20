package com.hari.udemy.exceptions;

import java.util.Date;

public class CustomErrorDetails {
	
	private Date date;
	private String message;
	private String errordetails;

	public CustomErrorDetails(Date date, String message, String errordetails) {
		super();
		this.date = date;
		this.message = message;
		this.errordetails = errordetails;
	}

	public Date getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}

	public String getErrordetails() {
		return errordetails;
	}

}
