package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {

	public Student() {
		super();
	}
	@Id
	private String universityRno;
	
	private String classId;
	
	private int feedbackStatus;
	
	private int registered;
	
	public String getUniversityRno() {
		return universityRno;
	}
	public void setUniversityRno(String universityRno) {
		this.universityRno = universityRno;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public int getFeedbackStatus() {
		return feedbackStatus;
	}
	public void setFeedbackStatus(int feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}
	public int getRegistered() {
		return registered;
	}
	public void setRegistered(int registered) {
		this.registered = registered;
	}
	@Override
	public String toString() {
		return "Student [universityRno=" + universityRno + ", classId=" + classId + ", feedbackStatus=" + feedbackStatus
				+ ", registered=" + registered + "]";
	}
	public Student(String universityRno, String classId, int feedbackStatus, int registered) {
		super();
		this.universityRno = universityRno;
		this.classId = classId;
		this.feedbackStatus = feedbackStatus;
		this.registered = registered;
	}
	
	
	
	
}
