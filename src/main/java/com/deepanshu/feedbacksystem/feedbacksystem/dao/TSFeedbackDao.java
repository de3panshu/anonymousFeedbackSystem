package com.deepanshu.feedbacksystem.feedbacksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.FeedbackCompositeKey;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.TSFeedback;

public interface TSFeedbackDao extends JpaRepository<TSFeedback,FeedbackCompositeKey>{

}
