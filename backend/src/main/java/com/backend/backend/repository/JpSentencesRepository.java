package com.backend.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.JpSentences;

@Repository
public interface JpSentencesRepository extends JpaRepository<JpSentences, Integer> {
	
	@Query(value = "SELECT * FROM jp_sentences WHERE id = (SELECT id FROM jp_sentences ORDER BY RAND() LIMIT 1)", nativeQuery = true)
	List<JpSentences> findRandomSentence();

}





