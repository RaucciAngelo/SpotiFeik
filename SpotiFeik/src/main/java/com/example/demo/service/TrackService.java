package com.example.demo.service;


public class TrackService {


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.repository.*;

@Service
public class TrackService {

	@Autowired
	private TrackRepo trackRepo;

	@Autowired
	private LyricsRepo lyricsRepo;

	public List<Track> getAllTracks() {
		return trackRepo.findAll();
	}

	public void save(Track track, Long idLyrics) {
		Track newTrack = new Track(track.getTitle(), track.getDuration(), track.getPlays(), track.isExplicit(),
				track.getReleaseDate(), lyricsRepo.getById(idLyrics));
		trackRepo.save(newTrack);
	}

	public void delete(Long id) {
		trackRepo.deleteById(id);
	}

	public void update(Long idTrack, Track track, Long idLyrics) {
		Track updateTrack = trackRepo.getReferenceById(idTrack);
		updateTrack = new Track(track.getTitle(), track.getDuration(), track.getPlays(), track.isExplicit(),
				track.getReleaseDate(), lyricsRepo.getById(idLyrics));

		trackRepo.save(updateTrack);

	}

}
