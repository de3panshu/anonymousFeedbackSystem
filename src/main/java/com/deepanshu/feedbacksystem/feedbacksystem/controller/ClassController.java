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

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Class;
import com.deepanshu.feedbacksystem.feedbacksystem.services.ClassService;

@RestController	

@CrossOrigin(origins = "http://localhost:3000")
public class ClassController {

	@Autowired
	private ClassService classService;
	
	public ClassController() {
		
	}
	
	@GetMapping("/classes")
	public List<Class> getAllClass()
	{
		return this.classService.getAllClassList();
	}
	
	@GetMapping("/classes/{classId}")
	public Class getClass(@PathVariable String classId)
	{
		return this.classService.getClass(classId);
	}
	
	@PostMapping("/classes")
	public ResponseEntity<HttpStatus> addClass(@RequestBody Class newClass)
	{
		try
		{
			this.classService.addClass(newClass);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/classes")
	public ResponseEntity updateClass(@RequestBody Class updatedClass)
	{
		try
		{
			this.classService.updateClass(updatedClass);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/classes/{classId}")
	public ResponseEntity deleteClass(@PathVariable String classId)
	{
		try
		{
			this.classService.deleteClass(classId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
