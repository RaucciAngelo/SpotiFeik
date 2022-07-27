package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LyricsRepo;
import com.example.demo.model.*;

@Service
@SuppressWarnings("deprecation")
public class LyricsService {
	
	@Autowired
	private LyricsRepo lyrics_repo;
	
	public void saveLyric(Lyrics lyric) {
		lyrics_repo.save(lyric);
	}
	
	//GET
	public List<Lyrics> getAllLyrics() {
		return lyrics_repo.findAll();
	}
	
	public Lyrics getLyricsById(Long id) {
		return lyrics_repo.getById(id);
	}
	
	public List<Lyrics> getLyricsByTesto(String testo) {
		return lyrics_repo.getLyricsByTesto(testo);
	}
	
	public Lyrics getLyricsByTrackId(Long id) {
		return lyrics_repo.getLyricsByTrackId(id);
	}
	
	//DELETE
	public void deleteLyricsById(Long id) {
		Lyrics app = this.getLyricsById(id);
		lyrics_repo.delete(app);
	}
	
	//UPDATE
	public void update(Long id, Lyrics lycrics) {
		Lyrics update_lyrics = new Lyrics();
		update_lyrics = this.getLyricsById(id);
		update_lyrics.setTesto(lycrics.getTesto());
		update_lyrics.setTrack(lycrics.getTrack());
		lyrics_repo.save(update_lyrics);
	}
	
	public void updateLycricsTesto(Long id, String testo) {
		Lyrics update_lyrics = new Lyrics();
		update_lyrics = this.getLyricsById(id);
		update_lyrics.setTesto(testo);
		lyrics_repo.save(update_lyrics);
	}
	
	public void updateLycricsTrack(Long id, Track track) {
		Lyrics update_lyrics = new Lyrics();
		update_lyrics = this.getLyricsById(id);
		update_lyrics.setTrack(track);
		lyrics_repo.save(update_lyrics);
	}
}
