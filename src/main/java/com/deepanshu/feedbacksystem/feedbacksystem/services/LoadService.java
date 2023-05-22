package com.deepanshu.feedbacksystem.feedbacksystem.services;

import java.util.List;

import com.deepanshu.feedbacksystem.feedbacksystem.entities.Loads;
import com.deepanshu.feedbacksystem.feedbacksystem.entities.LoadCompositeKey;

public interface LoadService {
	List<Loads> getAllLoad();
	public Loads getLoad(LoadCompositeKey loadId);
	public Loads addNewLoad(Loads newLoad);
	public Loads updateLoad(Loads updatedLoad);
	public Loads deleteLoad(LoadCompositeKey loadId);
}
