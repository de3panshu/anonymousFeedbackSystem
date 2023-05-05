package com.deepanshu.feedbacksystem.feedbacksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Teacher;
import com.deepanshu.feedbacksystem.feedbacksystem.services.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService; 
	
	@GetMapping("/teachers")
	public List<Teacher> getAllTeacher()
	{
		return this.teacherService.getAllTeacher();
	}
	@GetMapping("/teachers/validate")
	public Teacher validateTeacher(@RequestBody Teacher suspect)
	{
		return this.teacherService.isValidTeacher(suspect);
	}
	
	@GetMapping("/teachers/{teacherId}")
	public Teacher getTeacher(@PathVariable String teacherId)
	{
//		System.err.println("Running: getSpecific Teacher");
		return this.teacherService.getTeacher(teacherId);
	}
	
	@PostMapping("/teachers")
	public ResponseEntity<HttpStatus> addTeacher(@RequestBody Teacher newTeacher) 
	{
		try
		{
			this.teacherService.addTeacher(newTeacher);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/teachers")
	public ResponseEntity<HttpStatus> updateTeacher(@RequestBody Teacher updatedTeacherInfo)
	{
		try
		{
			this.teacherService.updateTeacher(updatedTeacherInfo);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/teachers/{teacherId}")
	public ResponseEntity<HttpStatus> deleteTeacher(@PathVariable String teacherId)
	{
		try
		{
			this.teacherService.removeTeacher(teacherId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
