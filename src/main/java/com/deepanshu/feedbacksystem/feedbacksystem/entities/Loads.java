package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Loads {

	@EmbeddedId
	private LoadCompositeKey  loadKey;
	
	public Loads() {
		// TODO Auto-generated constructor stub
	}

	public LoadCompositeKey getLoadKey() {
		return loadKey;
	}

	public void setLoadKey(LoadCompositeKey loadKey) {
		this.loadKey = loadKey;
	}

}
