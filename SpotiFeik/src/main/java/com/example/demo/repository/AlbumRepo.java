package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Album;

public interface AlbumRepo extends JpaRepository<Album, Long>{

}
