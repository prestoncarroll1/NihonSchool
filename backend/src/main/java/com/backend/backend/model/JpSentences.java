package com.backend.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JpSentences {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@Column(name = "jp_Sentece")
	private String jpSentence;
//	@Column(name = "eng_Sentece")
	private String engSentence;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getJpSentence() {
		return jpSentence;		
	}
	
	public void setJpSentence(String jpSentence) {
		this.jpSentence = jpSentence;
	}	
	
	public String getEngSentence() {
		return engSentence;
	}
	public void setEngSentence(String engSentence) {
		this.engSentence = engSentence;
	}
}