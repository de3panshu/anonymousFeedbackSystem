package com.deepanshu.feedbacksystem.feedbacksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback,String> {

}
