package com.deepanshu.feedbacksystem.feedbacksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Class;

public interface ClassDao extends JpaRepository<Class,String> {

}
