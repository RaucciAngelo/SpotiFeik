package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TrackAuthor;
import com.example.demo.service.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/trackAuthor")
public class TrackAuthorController {

	@Autowired
	private TrackAuthorService trackAuthorService;

	@GetMapping("/getAllTrackAuthors")
	public List<TrackAuthor> getAllTrackAuthors() {
		return trackAuthorService.getAllTrackAuthors();
	}

	@PostMapping("/addTrackAuthor/{idTrack}/{idAuthor}")
	public void addTrackAuthor(@PathVariable("idTrack") Long idTrack, @PathVariable("idAuthor") Long idAuthor) {
		trackAuthorService.save(idTrack, idAuthor);
	}

	@DeleteMapping("/deleteTrackAuthor/{id}")
	public void deleteTrackAuthor(@PathVariable("id") Long id) {
		trackAuthorService.delete(id);
	}

	@PutMapping("/updateTrackAuthor/{idTrackAuthor}/{idTrack}/{idAuthor}")
	public void updateTrackAuthor(@PathVariable("idTrackAuthor") Long idTrackAuthor,
			@PathVariable("idTrack") Long idTrack, @PathVariable("idAuthor") Long idAuthor) {
		trackAuthorService.update(idTrackAuthor, idTrack, idAuthor);
	}
}
