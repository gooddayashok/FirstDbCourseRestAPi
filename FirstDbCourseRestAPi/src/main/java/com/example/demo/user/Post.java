package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Post {

	private Integer id;
	
	private String description;
	



	public Integer getId() {
		return id;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	
	public String getDescription() {
		return description;
	}


	



	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
