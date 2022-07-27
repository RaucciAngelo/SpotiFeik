package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Playlist;

public interface PlaylistRepo extends JpaRepository<Playlist, Long>{

}
