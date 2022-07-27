package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Artista;

public interface ArtistaRepo extends JpaRepository<Artista, Long>{

}
