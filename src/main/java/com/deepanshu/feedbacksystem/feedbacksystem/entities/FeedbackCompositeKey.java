package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FeedbackCompositeKey implements Serializable{

	@Column(name="feedbackId")
	private String feedbackId;
	
	@Column(name="courseId")
	private String courseId;
	
	@Column(name="teacherId")
	private String teacherId;

	public FeedbackCompositeKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	
	
}
