package com.deepanshu.feedbacksystem.feedbacksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Loads;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.LoadCompositeKey;

public interface LoadDao extends JpaRepository<Loads,LoadCompositeKey>{

}
