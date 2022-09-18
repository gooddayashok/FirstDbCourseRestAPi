package com.example.demo.user.student;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.student.response.ResponseHandler;

@RestController
public class StudentController {
	
	
	
	@Autowired  
	StudentService studentService;  
	//creating a get mapping that retrieves all the students detail from the database   
	@GetMapping("/student")  
	private List<Student> getAllStudent()   
	{  
	return studentService.getAllStudent();  
	}  
	
	@PostMapping("/addstudent")
	private ResponseEntity<Object> saveStudent(@RequestBody Student  student)
	{
		
		try 
		{
			studentService.saveOrUpdate(student);
		
			return	ResponseHandler.generateResponse("Get data successs fully ",HttpStatus.OK,null);			
			
		}
		catch (Exception exception)
		{
			return	ResponseHandler.generateResponse("Some thing went wrong",HttpStatus.MULTI_STATUS, null);			
		}
		
		
		
	}
	
	@GetMapping("/student/{id}")  
	private ResponseEntity<Object> getStudent(@PathVariable int id)   
	{  
		try 
		{
		
			return	ResponseHandler.generateResponse("Get data successs fully ",HttpStatus.OK, studentService.getStudent(id));			
			
		}
		catch (Exception exception)
		{
			return	ResponseHandler.generateResponse("Some thing went wrong",HttpStatus.MULTI_STATUS, null);			
		}
		
		
  
	}

}
