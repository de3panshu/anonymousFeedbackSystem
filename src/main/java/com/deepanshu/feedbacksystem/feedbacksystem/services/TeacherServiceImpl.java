package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.TeacherDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Teacher;
import com.deepanshu.feedbacksystem.feedbacksystem.utility.Hashing;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	public List<Teacher> getAllTeacher() {

		return teacherDao.findAll();
	}

	@Override
	public Teacher getTeacher(String teacherId) {

		return teacherDao.findById(teacherId).get();
	}

	@Override
	public Teacher addTeacher(Teacher newTeacher) {
		return teacherDao.save(newTeacher);
	}

	@Override
	public Teacher updateTeacher(Teacher updatedTeacher) {
		return teacherDao.save(updatedTeacher);
	}

	@Override
	public void removeTeacher(String teacherId) {
		Teacher target = this.getTeacher(teacherId);
		teacherDao.delete(target);
		
	}

	@Override
	public Teacher isValidTeacher(Teacher suspect) {
		Teacher target = null; 
		target = this.getTeacher(suspect.getId());
		if(target == null) {
			return null;
		}
		try {
			if(suspect.getPassword().equals(target.getPassword()))
			{
				return target;
			}
		} catch (	Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
