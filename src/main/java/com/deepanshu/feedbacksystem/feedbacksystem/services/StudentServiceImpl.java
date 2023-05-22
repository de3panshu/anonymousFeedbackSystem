package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.StudentDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> getAllStudent() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(String studentId) {
		return studentDao.findById(studentId).get();
	}

	@Override
	public Student addStudent(Student newStudent) {
		return studentDao.save(newStudent);
	}

	@Override
	public Student updateStudent(Student updatedStudent) {
		return studentDao.save(updatedStudent);
	}
	@Override
	public void removeStudent(String studentId) {
		Student targetStudent = this.getStudent(studentId);
		studentDao.delete(targetStudent);
	}
	
}
