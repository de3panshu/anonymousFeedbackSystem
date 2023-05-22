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

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Feedback;
import com.deepanshu.feedbacksystem.feedbacksystem.services.FeedbackService;
import com.deepanshu.feedbacksystem.feedbacksystem.utility.Hashing;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;
	public FeedbackController() {

	}
	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback()
	{
		return feedbackService.getAllFeedback();
	}
	
	
	@PostMapping("/feedback")
	public ResponseEntity addFeedback(@RequestBody Feedback newFeedback	)
	{	
		try
		{
			System.out.println("OLD: "+newFeedback.getId());
			newFeedback.setId(Hashing.hashing(newFeedback.getId()));
			System.out.println("NEW: "+newFeedback.getId());
//			System.out.println("NEW: "+newFeedback.getId());
			feedbackService.addFeedback(newFeedback);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping("/feedback")
	public ResponseEntity updateFeedback(@RequestBody Feedback updatedFeedback)
	{
		try
		{
			updatedFeedback.setId(Hashing.hashing(updatedFeedback.getId()));
			feedbackService.updateFeedback(updatedFeedback);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@DeleteMapping("/feedback/{fid}")
	public ResponseEntity deleteFeedback(@PathVariable String fid)
	{
		try
		{
			System.out.println("fid: "+fid);
			
			fid = Hashing.hashing(fid);
			System.out.println("hash: "+fid);
			feedbackService.deleteFeedback(fid);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
