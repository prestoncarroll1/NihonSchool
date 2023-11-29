package com.backend.backend.service;

import com.backend.backend.model.Hiragana;
import com.backend.backend.repository.HiraganaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiraganaServiceImpl implements HiraganaService {

	@Autowired
	private HiraganaRepository hiraganaRepository;
	
	@Override
	public Hiragana saveHiragana(Hiragana hiragana) {
		// TODO Auto-generated method stub
		return hiraganaRepository.save(hiragana);
	}

}
