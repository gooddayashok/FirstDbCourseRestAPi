package com.example.demo.user.student;

import java.sql.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


//define exception handling for all exception 
@ControllerAdvice
@RestController
 

public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)  
	//override method of ResponseEntityExceptionHandler class  
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request)  
	{  
	//creating exception response structure  
	ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));  
	//returning exception structure and specific status   
	return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);  
	}  
	
	
	
	

}
