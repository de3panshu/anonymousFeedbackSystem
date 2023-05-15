package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
