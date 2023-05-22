package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.FeedbackDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;
	
	public FeedbackServiceImpl() {
		
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return feedbackDao.findAll();
	}

	@Override
	public Feedback getFeedback(String feedbackId) {
		return feedbackDao.findById(feedbackId).get();
	}

	@Override
	public Feedback addFeedback(Feedback newFeedback) {
		return feedbackDao.save(newFeedback);
	}

	@Override
	public Feedback updateFeedback(Feedback updatedFeedback) {
		//update feedback only when the id exist
		Feedback target = null;
		try
		{
			target = feedbackDao.findById(updatedFeedback.getId()).get();
			if(target != null)
				feedbackDao.save(updatedFeedback);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return updatedFeedback;
	}

	@Override
	public void deleteFeedback(String feedbackId) {
		Feedback target = null;
		try
		{
			target = feedbackDao.findById(feedbackId).get();
			feedbackDao.delete(target);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
