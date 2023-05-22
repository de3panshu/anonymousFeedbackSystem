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

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Course;
import com.deepanshu.feedbacksystem.feedbacksystem.services.CourseService;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

	@Autowired
	private CourseService courseService; 
	
	public CourseController() {

	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourse()
	{
		return this.courseService.getAllCourseList();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
//		System.err.println("Running: getSpecific Course");
		return this.courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public ResponseEntity<HttpStatus> addCourse(@RequestBody Course newCourse) 
	{
		try
		{
			this.courseService.addCourse(newCourse);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/courses")
	public ResponseEntity<HttpStatus> updateCourse(@RequestBody Course updatedCourseInfo)
	{
		try
		{
			this.courseService.updateCourse(updatedCourseInfo);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try
		{
			this.courseService.removeCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
