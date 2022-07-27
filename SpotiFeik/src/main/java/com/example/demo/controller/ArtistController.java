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

import com.example.demo.model.Artist;
import com.example.demo.service.ArtistService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/artist")
public class ArtistController {

	@Autowired
	private ArtistService artistService;

	@GetMapping("/getAllArtists")
	public List<Artist> getAllArtists() {
		return artistService.getAllArtists();
	}

	@PostMapping("/addArtist​​​​​​")
	public void addArtist(@RequestBody Artist artist) {
		artistService.saveArtist(artist);
	}

	@DeleteMapping("/deleteArtist/{​​​​​​id}​​​​​​")
	public void deleteArtist(@PathVariable("id") Long id) {
		artistService.deleteArtist(id);
	}

	@PutMapping("/updateArtist/{​​​​​​id}​​​​​​")
	public void updateArtist(@PathVariable("id") Long id, @RequestBody Artist artist) {
		artistService.updateArtist(id, artist);
	}
}
