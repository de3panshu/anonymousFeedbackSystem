package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.FeedbackCompositeKey;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.TSFeedback;

@Service
public interface TSFeedbackService {
	List<TSFeedback> getAllTSFeedback();
	public TSFeedback getTSFeedback(FeedbackCompositeKey tsFeedbackId);
	public TSFeedback addTSFeedback(TSFeedback newTSFeedback);
	public TSFeedback updateTSFeedback(TSFeedback updatedTSFeedback);
	public void deleteTSFeedback(FeedbackCompositeKey tsFeedbackId);	
	
}
