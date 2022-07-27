package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Artist;

public interface ArtistRepo extends JpaRepository<Artist, Long>{

}
