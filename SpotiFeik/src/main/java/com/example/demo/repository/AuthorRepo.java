package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

	@Query(value = "select a.* from author as a JOIN track_author as ta ON a.id = ta.author_id JOIN track as t ON t.id = ta.track_id where t.id = :id", nativeQuery = true)
	public List<Author> getAuthorByTrack(@Param("id") Long id);
}
