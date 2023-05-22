package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepanshu.feedbacksystem.feedbacksystem.dao.LoadDao;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.Loads;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.LoadCompositeKey;

@Service
public class LoadServiceImpl implements LoadService {

	@Autowired
	private LoadDao loadDao;	
	
	public LoadServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Loads> getAllLoad() {
		return this.loadDao.findAll();
	}

	@Override
	public Loads getLoad(LoadCompositeKey loadId) {
		// TODO Auto-generated method stub
		return this.loadDao.findById(loadId).get();
	}

	@Override
	public Loads addNewLoad(Loads newLoad) {
		// TODO Auto-generated method stub
		return this.loadDao.save(newLoad);
	}

	@Override
	public Loads updateLoad(Loads updatedLoad) {
		// TODO Auto-generated method stub
		return this.loadDao.save(updatedLoad);
	}

	@Override
	public Loads deleteLoad(LoadCompositeKey loadId) {
		// TODO Auto-generated method stub
		Loads target = this.getLoad(loadId);
		return this.loadDao.save(target);
	}

}
