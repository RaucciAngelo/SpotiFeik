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

import com.example.demo.model.Playlist;
import com.example.demo.service.PlaylistService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PlaylistController {

	@Autowired
	private PlaylistService playlistService;

	@GetMapping("/getAllPlaylist")
	public List<Playlist> getAllPlaylist() {
		return playlistService.getAllPlaylist();
	}

	@PostMapping("/addPlaylist")
	public void addPlaylist(@RequestBody Playlist playlist) {
		playlistService.savePlaylist(playlist);
	}

	@DeleteMapping("/deletePlaylist/{id}")
	public void deletePlaylist(@PathVariable("id") Long id) {
		playlistService.deletePlaylist(id);
	}

	@PutMapping("/updatePlaylist/{id}")
	public void updatePlaylist(@PathVariable("id") Long id, @RequestBody Playlist playlist) {
		playlistService.update(id, playlist);
	}

}