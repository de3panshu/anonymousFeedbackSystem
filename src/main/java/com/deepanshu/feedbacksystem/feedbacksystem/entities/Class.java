package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Class {
	
	@Id
	private String id;
	private String name;
	private int strength;
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class(String id, String name, int strength) {
		super();
		this.id = id;
		this.name = name;
		this.strength = strength;
	}
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
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", strength=" + strength + "]";
	}
	
}
