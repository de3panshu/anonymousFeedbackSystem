package com.deepanshu.feedbacksystem.feedbacksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Student;
import com.deepanshu.feedbacksystem.feedbacksystem.services.StudentService;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
	
	@Autowired	
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		return this.studentService.getAllStudent();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable String studentId)
	{
//		System.err.println("Running: getSpecific student");
		return this.studentService.getStudent(studentId);
	}
	
	@PostMapping("/students")
	public ResponseEntity<HttpStatus> addStudent(@RequestBody Student newStudent) 
	{
		try
		{
			this.studentService.addStudent(newStudent);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/students")
	public ResponseEntity<HttpStatus> updateStudent(@RequestBody Student updatedStudentInfo)
	{
		try
		{
			this.studentService.updateStudent(updatedStudentInfo);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId)
	{
		try
		{
			this.studentService.removeStudent(studentId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
