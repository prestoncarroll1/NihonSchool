package com.backend.backend.service;

import java.util.List;
import com.backend.backend.model.JpSentences;

public interface JpSentencesService {

	public JpSentences saveJpSentences(JpSentences jpSentences);

	List<JpSentences> getAllJpSentences();
	
	JpSentences getRandomJpSentence();
	
}












	
