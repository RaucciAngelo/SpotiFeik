package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrackAuthor;

@Repository
public interface TrackAuthorRepo extends JpaRepository<TrackAuthor, Long> {

}
