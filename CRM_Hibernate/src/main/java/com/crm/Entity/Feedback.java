package com.crm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Feedback {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Feedback_Id")
    private Long Feedback_Id;
    
    @ManyToOne
    private Issue issue;
    
    private String comment;
    
    public Feedback(Issue issue, String comment) {
		super();
		this.issue = issue;
		this.comment = comment;
	} 
    public Feedback() {
		
	}

	
    // Other fields, getters, setters...

	public Long getFeedback_Id() {
		return Feedback_Id;
	}

	public void setFeedback_Id(Long feedback_Id) {
		Feedback_Id = feedback_Id;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
