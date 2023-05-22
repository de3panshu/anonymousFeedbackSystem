package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Feedback;

public interface FeedbackService {
	List<Feedback> getAllFeedback();
	public Feedback getFeedback(String feedbackId);
	public Feedback addFeedback(Feedback newFeedback);
	public Feedback updateFeedback(Feedback updatedFeedback);
	public void deleteFeedback(String feedbackId);
}
