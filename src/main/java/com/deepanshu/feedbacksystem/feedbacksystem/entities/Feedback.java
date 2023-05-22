package com.deepanshu.feedbacksystem.feedbacksystem.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Feedback {//

	@Id	
	private String id;//hash of university rno and secret key
//	@Temporal(TemporalType.TIMESTAMP)
//    private Date timestamp;
	
	@ElementCollection
	@CollectionTable(name = "feedback_scores", joinColumns = @JoinColumn(name = "feedback_id"))
	@Column(name = "score")
    private List<Integer> scores;
	
	private String message;
	
	public Feedback() {
//		this.setTimestamp(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public Date getTimestamp() {
//		return timestamp;
//	}

//	public void setTimestamp(Date timestamp) {
//		this.timestamp = timestamp;
//	}

	public List<Integer> getValues() {
		return scores;
	}

	public void setValues(List<Integer> values) {
		this.scores = values;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
