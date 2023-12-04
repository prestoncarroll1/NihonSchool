package com.backend.backend.service;


import com.backend.backend.model.JpSentences;
import com.backend.backend.repository.JpSentencesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpSentencesServiceImpl implements JpSentencesService {

	@Autowired
	private JpSentencesRepository jpSentencesRepository;
	
	@Override
	public JpSentences saveJpSentences(JpSentences jpSentences) {
		// TODO Auto-generated method stub
		return jpSentencesRepository.save(jpSentences);
	}
	
	@Override
	public List<JpSentences> getAllJpSentences(){
		return jpSentencesRepository.findAll();
	}
	
	@Override
	public JpSentences getRandomJpSentence() {
	    // Use a native query with ORDER BY RAND() to get a random sentence
	    List<JpSentences> sentences = jpSentencesRepository.findRandomSentence();
	    
	    // Check if the list is not empty before returning
	    return sentences.isEmpty() ? null : sentences.get(0);
	}

}
