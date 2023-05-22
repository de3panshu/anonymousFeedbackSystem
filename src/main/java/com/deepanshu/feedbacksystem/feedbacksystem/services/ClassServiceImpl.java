package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.ClassDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Class;

@Service
public class ClassServiceImpl implements ClassService {

	@Autowired
	private ClassDao classDao;
	
	public ClassServiceImpl() {
		
	}

	@Override
	public List<Class> getAllClassList() {
		
		return classDao.findAll();
	}

	@Override
	public Class getClass(String classId) {
		return classDao.findById(classId).get();
	}

	@Override
	public Class addClass(Class newClass) {
		return classDao.save(newClass);
	}

	@Override
	public Class updateClass(Class updatedClass) {
		return classDao.save(updatedClass);
	}

	@Override
	public void deleteClass(String classId) {
		Class target = classDao.findById(classId).get();
		classDao.delete(target);
	}

}
