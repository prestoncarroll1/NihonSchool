package com.backend.backend.service;

import java.util.List;

import com.backend.backend.model.Hiragana;

public interface HiraganaService {

	public Hiragana saveHiragana(Hiragana hiragana);

	List<Hiragana> getAllHiragana();
	
}
