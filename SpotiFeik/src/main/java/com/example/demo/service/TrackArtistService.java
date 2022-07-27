package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TrackArtist;
import com.example.demo.repository.ArtistRepo;
import com.example.demo.repository.TrackArtistRepo;
import com.example.demo.repository.TrackRepo;

@Service
public class TrackArtistService {
	@Autowired
	TrackArtistRepo trackArtistRepo;

	@Autowired
	TrackRepo trackRepo;

	@Autowired
	ArtistRepo artistRepo;

	public List<TrackArtist> getAllTrackArtist() {
		return trackArtistRepo.findAll();
	}

	public void addTrackToArtist(Long idTrack, Long idArtist) {
		TrackArtist trackArtist = new TrackArtist(trackRepo.getReferenceById(idTrack), artistRepo.getReferenceById(idArtist));
		trackArtistRepo.save(trackArtist);
	}

	public void deleteTrackArtist(Long id) {
		trackArtistRepo.deleteById(id);
	}

	public void deleteTrackFromArtist(Long idTrack, Long idArtist) {
		trackArtistRepo.deleteTrackFromArtists(idTrack, idArtist);
	}

	public void deleteArtistAndHisTracks(Long idArtist) {
		trackArtistRepo.deleteArtistAndTracks(idArtist);
	}

	public void updateTrack(Long idTrackArtist, Long idTrack, Long idArtist) {
		TrackArtist updateTrackArtist = trackArtistRepo.getReferenceById(idTrackArtist);
		updateTrackArtist = new TrackArtist(trackRepo.getReferenceById(idTrack), artistRepo.getReferenceById(idArtist));
		trackArtistRepo.save(updateTrackArtist);
	}

}
