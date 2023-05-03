package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Student;



public interface StudentService {
	public List<Student> getAllStudent();

	public Student getStudent(String studentId);

	public Student addStudent(Student newStudent);

	public Student updateStudentt(Student updatedStudent);

	public void removeStudent(String studentId);
}
