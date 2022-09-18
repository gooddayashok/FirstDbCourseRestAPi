package com.example.demo.user.student;

import java.util.Date;

public class ExceptionResponse
{
	private Date timestamp;
	private String messge;
	private String details;
	public ExceptionResponse(Date timestamp, String messge, String details) {
		super();
		this.timestamp = timestamp;
		this.messge = messge;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessge() {
		return messge;
	}
	public String getDetails() {
		return details;
	}
	
	
	 
	
	
	
	

}
