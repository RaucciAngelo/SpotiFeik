package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Track;

@Repository
public interface TrackRepo extends JpaRepository<Track, Long> {

}
