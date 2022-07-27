package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.service.TrackService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/user")
public class TrackController {

	@Autowired
	private TrackService trackService;

	@GetMapping("/getAllTracks")
	public List<Track> getAllTracks() {
		return trackService.getAllTracks();
	}

	@PostMapping("/addTrack/{idLyrics}/{idAlbum}")
	public void addTrack(@RequestBody Track track, @PathVariable("idLyrics") Long idLyrics, @PathVariable("idAlbum") Long idAlbum) {
		trackService.save(track, idLyrics, idAlbum);
	}

	@DeleteMapping("/deleteTrack/{id}")
	public void deleteTrack(@PathVariable("id") Long id) {
		trackService.delete(id);
	}

	@PutMapping("/updateTrack/{idTrack}/{idLyrics}/{idAlbum}")
	public void updateTrack(@PathVariable("idTrack") Long idTrack, @RequestBody Track track,
			@PathVariable("idLyrics") Long idLyrics, @PathVariable("idAlbum") Long idAlbum) {
		trackService.update(idTrack, track, idLyrics, idAlbum);
	}
	
	@GetMapping("/getAuthorByTrack/{idTrack}")
	public List<Author> getAuthorByTrack(@PathVariable("idTrack") Long idTrack) {
		return trackService.getAuthorByTrack(idTrack);
	}
	
	@GetMapping("/getArtistByTrack/{idTrack}")
	public List<Artist> getArtistByTrack(@PathVariable("idTrack") Long idTrack) {
		return trackService.getArtistByTrack(idTrack);
	}

	@GetMapping("/getArtistAuthorByTrack/{idTrack}")
	public List<ReturnData> getArtistAuthorByTrack(@PathVariable("idTrack") Long idTrack) {
		return trackService.getArtistAuthorByTrack(idTrack);
	}
	
}
