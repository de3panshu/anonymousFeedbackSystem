package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import java.security.NoSuchAlgorithmException;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.deepanshu.feedbacksystem.feedbacksystem.utility.Hashing;

@Entity
public class Teacher {
		
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	@Id
	private String id;
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		try 
		{
			this.password = Hashing.hashing(password);
		} 
		catch (NoSuchAlgorithmException e) {
			System.err.println("Password is not able to hashed saving it in plain format");
			this.password = password;
		}
	}
	public Teacher(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public Teacher() {
		super();
		
	}
	
	
}
