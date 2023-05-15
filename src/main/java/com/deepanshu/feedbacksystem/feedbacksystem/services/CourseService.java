package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Course;

public interface CourseService {
	
	List<Course> getAllCourseList();
	public Course getCourse(int courseId);
	public Course addCourse(Course newCourse);
	public Course updateCourse(Course updatedCourse);
	public void removeCourse(int courseId);
	
}
