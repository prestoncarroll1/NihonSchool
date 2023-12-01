package com.backend.backend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.JpSentences;
import com.backend.backend.service.JpSentencesService;

@RestController
@RequestMapping("/japaneseSentences")
@CrossOrigin
public class JpSentencesController {

	@Autowired
	private JpSentencesService jpSentencesService;
	
	@PostMapping("/add")
	public String add(@RequestBody JpSentences jpSentences) {
		jpSentencesService.saveJpSentences(jpSentences);
		return "New Hiragana response is added.";
	}
	
	@GetMapping("/getAll")
	public List<JpSentences> getAllJapaneseSentences(){
		return jpSentencesService.getAllJpSentences();
	}
}