package com.example.demo.user.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
	
	@Autowired
	StudentRepository repository;

	//getting all student records  
	public List<Student> getAllStudent()   
	{  
	List<Student> students = new ArrayList<Student>();  
	repository.findAll().forEach(student -> students.add(student));  
	return students;  
	}  
	
	// save student data 
	public void saveOrUpdate(Student student)
	{
		
		repository.save(student);
	}
	// get student records 
	public Student getStudent(int id)
	{
	Optional<Student> student=	repository.findById(id);
	  if(!student.isPresent())
	  {
		  
	  throw new StudentNotFoundExeption("id:"+id);	  
		  
	  }
	  return student.get();
	
	}
	
	
}
