package com.deepanshu.feedbacksystem.feedbacksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Student;

public interface StudentDao extends JpaRepository<Student,String>
{
	
}
