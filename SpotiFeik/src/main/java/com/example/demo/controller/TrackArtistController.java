package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.TrackArtist;
import com.example.demo.service.TrackArtistService;

@RestController
@RequestMapping("/api/songartist")
public class TrackArtistController {

	@Autowired
	TrackArtistService trackArtistService;

	@GetMapping("/getAllTrackArtist")
	public List<TrackArtist> getAllTrackArtist() {
		return trackArtistService.getAllTrackArtist();
	}
	
	@PostMapping("/addTrackToArtist/{idTrack}/{idArtist}")
	public void addSongToArtist(@PathVariable("idTrack") Long idTrack, @PathVariable("idArtist") Long idArtist) {
		trackArtistService.addTrackToArtist(idTrack, idArtist);
	}
	
	@DeleteMapping("/deleteTrackArtist/{id}")
	public void deleteTrackArtist(@PathVariable("id") Long id) {
		trackArtistService.deleteTrackArtist(id);
	}

	@DeleteMapping("/deleteTrackFromArtist/{idTrack}/{idArtist}")
	public void deleteTrackFromArtist(@PathVariable("idTrack") Long idTrack, @PathVariable("idArtist") Long idArtist) {
		trackArtistService.deleteTrackFromArtist(idTrack, idArtist);
	}

	@DeleteMapping("/deleteArtistAndHisTracks/{idArtist}")
	public void deleteArtistAndHisTracks(@PathVariable("idArtist") Long idArtist) {
		trackArtistService.deleteArtistAndHisTracks(idArtist);
	}

	@PutMapping("/updateTrack/{idTrackArtist}/{idTrack}/{idArtist}")
	public void updateTrack(@PathVariable("idTrackArtist") Long idTrackArtist, @PathVariable("idTrack") Long idTrack, @PathVariable("idArtist") Long idArtist) {
		trackArtistService.updateTrack(idTrackArtist, idTrack, idArtist);
	}
}
