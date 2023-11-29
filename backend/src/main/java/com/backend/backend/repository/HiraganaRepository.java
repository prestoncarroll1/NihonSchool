package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.Hiragana;

@Repository
public interface HiraganaRepository extends JpaRepository<Hiragana, Integer> {

}
