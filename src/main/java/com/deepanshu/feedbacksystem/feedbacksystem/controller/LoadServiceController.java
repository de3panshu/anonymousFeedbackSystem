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

import com.deepanshu.feedbacksystem.feedbacksystem.entities.LoadCompositeKey;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Loads;
import com.deepanshu.feedbacksystem.feedbacksystem.services.LoadService;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class LoadServiceController {

	@Autowired
	private LoadService loadService;
	
	
	public LoadServiceController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/load")
	public List<Loads> getAllLoad()
	{
		return loadService.getAllLoad();
	}
	@PostMapping("/load")
	public ResponseEntity addTSFeedback(@RequestBody Loads load)
	{
		try
		{
			loadService.addNewLoad(load);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/load/loadId")
	public ResponseEntity deleteTSFeedback(LoadCompositeKey loadId)
	{
		try
		{
			this.loadService.deleteLoad(loadId);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
