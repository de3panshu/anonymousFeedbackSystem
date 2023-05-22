package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class TSFeedback {

	@EmbeddedId
	private FeedbackCompositeKey feedbackKey;

	public TSFeedback() {
		super();
	}

	public FeedbackCompositeKey getFeedbackKey() {
		return feedbackKey;
	}

	public void setFeedbackKey(FeedbackCompositeKey feedbackKey) {
		this.feedbackKey = feedbackKey;
	}
	
	
	

}
