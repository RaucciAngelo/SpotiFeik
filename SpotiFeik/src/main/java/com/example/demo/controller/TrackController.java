package com.example.demo.controller;


public class TrackController {


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Track;
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

	@PostMapping("/addTrack/{idLyrics}")
	public void addAccount(@RequestBody Track track, @PathVariable Long idLyrics) {
		trackService.save(track, idLyrics);
	}

	@DeleteMapping("/deleteTrack/{id}")
	public void deleteTrack(@PathVariable("id") Long id) {
		trackService.delete(id);
	}

	@PutMapping("/updateTrack/{{idTrack}}/{idLyrics}")
	public void updateTrack(@PathVariable("idTrack") Long idTrack, @RequestBody Track track,
			@PathVariable("idLyrics") Long idLyrics) {
		trackService.update(idTrack, track, idLyrics);
	}


}
