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
	
//	@Column(name = "japaneseSenteces")
	private String jpSentences;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getJapaneseSentences() {
		return jpSentences;		
	}
	
	public void setJapaneseSentences(String japaneseSentences) {
		this.jpSentences = japaneseSentences;
	}	
}