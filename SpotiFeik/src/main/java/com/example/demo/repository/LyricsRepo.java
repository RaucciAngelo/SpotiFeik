package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Lyrics;

public interface LyricsRepo extends JpaRepository<Lyrics, Long>{

}
