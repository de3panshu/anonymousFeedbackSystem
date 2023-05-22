package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.TSFeedbackDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.FeedbackCompositeKey;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.TSFeedback;

@Service
public class TSFeedbackServiceImpl implements TSFeedbackService 
{
	@Autowired
	private TSFeedbackDao tsFeedbackDao;
	
	@Override
	public List<TSFeedback> getAllTSFeedback() {
		return this.tsFeedbackDao.findAll();
	}

	@Override
	public TSFeedback getTSFeedback(FeedbackCompositeKey tsFeedbackId) {
		return this.tsFeedbackDao.findById(tsFeedbackId).get();
	}

	@Override
	public TSFeedback addTSFeedback(TSFeedback newTSFeedback) {
		return this.tsFeedbackDao.save(newTSFeedback);
	}

	@Override
	public TSFeedback updateTSFeedback(TSFeedback updatedTSFeedback) {
		return this.tsFeedbackDao.save(updatedTSFeedback);
	}

	@Override
	public void deleteTSFeedback(FeedbackCompositeKey tsFeedbackId) {
		TSFeedback target = this.tsFeedbackDao.findById(tsFeedbackId).get();
		this.tsFeedbackDao.delete(target);
		
	}
	
}