package com.example.demo.user.student;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;  
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundExeption extends RuntimeException {



	public StudentNotFoundExeption(String id)
	{
		super(id);
	}
	

}
