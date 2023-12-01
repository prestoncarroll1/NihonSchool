package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.JpSentences;

@Repository
public interface JpSentencesRepository extends JpaRepository<JpSentences, Integer> {

}





