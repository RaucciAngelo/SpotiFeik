package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Lyrics;

@Repository
public interface LyricsRepo extends JpaRepository<Lyrics, Long> {

	@Query(value = "select distinct L.* from Lyrics L where L.testo = :testo", nativeQuery = true)
	public List<Lyrics> getLyricsByTesto(@Param("testo") String testo);

	@Query(value = "select distinct L.* from Lyrics L, Track T where T.id = :id and B.id_lyrics = L.id_lyrics", nativeQuery = true)
	public Lyrics getLyricsByTrackId(@Param("id") Long id);
}
