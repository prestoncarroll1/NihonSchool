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

}
