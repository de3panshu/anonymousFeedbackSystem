package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Class;



public interface ClassService {
	List<Class> getAllClassList();
	public Class getClass(String classID );
	public Class addClass(Class newClass);
	public Class updateClass(Class updatedClass);
	public void deleteClass(String classId);
	
}
