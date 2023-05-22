package com.deepanshu.feedbacksystem.feedbacksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Course;

public interface CourseDao extends JpaRepository<Course,String>{

}
