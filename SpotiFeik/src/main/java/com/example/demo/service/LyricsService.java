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
	private LyricsRepo lyricsRepo;

	public void saveLyrics(Lyrics lyric) {
		lyricsRepo.save(lyric);
	}

	// GET
	public List<Lyrics> getAllLyrics() {
		return lyricsRepo.findAll();
	}

	public Lyrics getLyricsById(Long id) {
		return lyricsRepo.getById(id);
	}

	public List<Lyrics> getLyricsByTesto(String testo) {
		return lyricsRepo.getLyricsByTesto(testo);
	}

	public Lyrics getLyricsByTrackId(Long id) {
		return lyricsRepo.getLyricsByTrackId(id);
	}

	// DELETE
	public void deleteLyricsById(Long id) {
		lyricsRepo.deleteById(id);
	}

	// UPDATE
	public void update(Long id, Lyrics lycrics) {
		Lyrics updateLyrics = lyricsRepo.getReferenceById(id);
		updateLyrics = new Lyrics(lycrics.getLyrics());
		lyricsRepo.save(updateLyrics);
	}

	public void updateLycricsTesto(Long id, String testo) {
		Lyrics update_lyrics = new Lyrics();
		update_lyrics = this.getLyricsById(id);
		update_lyrics.setLyrics(testo);
		lyricsRepo.save(update_lyrics);
	}

	public void updateLycricsTrack(Long id, Track track) {
		Lyrics update_lyrics = new Lyrics();
		update_lyrics = this.getLyricsById(id);
		update_lyrics.setTrack(track);
		lyricsRepo.save(update_lyrics);
	}
}
