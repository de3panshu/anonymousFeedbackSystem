package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Teacher;;
public interface TeacherService {

	List<Teacher> getAllTeacher();
	public Teacher getTeacher(String teacherId);

	public Teacher addTeacher(Teacher newTeacher);

	public Teacher updateTeacher(Teacher updatedTeacher);

	public void removeTeacher(String teacherId);
	
	public Teacher isValidTeacher(Teacher suspect);//based only on id and password
	
}
