package com.deepanshu.feedbacksystem.feedbacksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.FeedbackCompositeKey;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.TSFeedback;
import com.deepanshu.feedbacksystem.feedbacksystem.services.TSFeedbackService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TSFeedbackController {

	@Autowired
	private TSFeedbackService tsFeedbackService;
	
	public TSFeedbackController() {
	
	}
	
	@GetMapping("/tsfeedback")
	public List<TSFeedback> getAllTSFeedback()
	{
		return tsFeedbackService.getAllTSFeedback();
	}
	@PostMapping("/tsfeedback")
	public ResponseEntity addTSFeedback(@RequestBody TSFeedback tsFeedback)
	{
		try
		{
			tsFeedbackService.addTSFeedback(tsFeedback);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/tsfeedback/tsFeedbackId")
	public ResponseEntity deleteTSFeedback(FeedbackCompositeKey tsFeedbackId)
	{
		try
		{
			this.tsFeedbackService.deleteTSFeedback(tsFeedbackId);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
