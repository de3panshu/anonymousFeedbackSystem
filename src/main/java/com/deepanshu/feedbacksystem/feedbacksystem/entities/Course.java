package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	public Course(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
		
	}
	

}
