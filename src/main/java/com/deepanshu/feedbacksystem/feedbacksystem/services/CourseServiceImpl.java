package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.CourseDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
	}

	@Override
	public List<Course> getAllCourseList() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course newCourse) {
		return courseDao.save(newCourse);
	}

	@Override
	public Course updateCourse(Course updatedCourse) {
		return courseDao.save(updatedCourse);
	}

	@Override
	public void removeCourse(int courseId) {
		Course target = this.getCourse(courseId);
		courseDao.delete(target);
	}

}
