package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Hiragana;
import com.backend.backend.service.HiraganaService;

@RestController
@RequestMapping("/hiragana")
@CrossOrigin
public class HiraganaController {

	@Autowired
	private HiraganaService hiraganaService;
	
	@PostMapping("/add")
	public String add(@RequestBody Hiragana hiragana) {
		hiraganaService.saveHiragana(hiragana);
		return "New Hiragana response is added.";
	}
	
	@GetMapping("/getAll")
	public List<Hiragana> getAllHiragana(){
		return hiraganaService.getAllHiragana();
	}
}
