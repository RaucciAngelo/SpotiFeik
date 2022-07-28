package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Long> {

	@Query(value = "select a.* from artist as a JOIN track_artist as ta ON a.id = ta.artist_id JOIN track as t ON t.id = ta.track_id where t.id = :id", nativeQuery = true)
	public List<Artist> getArtistByTrack(@Param("id") Long id);

}
