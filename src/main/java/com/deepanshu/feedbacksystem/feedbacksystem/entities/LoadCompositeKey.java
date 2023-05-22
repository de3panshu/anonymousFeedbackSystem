package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LoadCompositeKey implements Serializable	{

	@Column(name="teacherId")
	private String teacherId;
	
	@Column(name="courseId")
	private String courseId;
	
	@Column(name="classId")
	private String classId;
	
	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public LoadCompositeKey() {
		// TODO Auto-generated constructor stub
	}

}
