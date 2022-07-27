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

import com.example.demo.model.Album;
import com.example.demo.service.AlbumService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/album")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@GetMapping("/getAllAlbums")
	public List<Album> getAllAlbums() {
		return albumService.getAllAlbums();
	}

	@GetMapping("/getAlbumById/{id}")
	public Album getAlbumId(@PathVariable("id") Long id) {
		return albumService.getAlbumId(id);
	}

	@PostMapping("/addAlbum")
	public void addAlbum(@RequestBody Album album) {
		albumService.addAlbum(album);
	}

	@DeleteMapping("/deleteAlbum/{id}")
	public void deleteAlbum(@PathVariable("id") Long id_album) {
		albumService.deleteAlbum(id_album);
	}

	@PutMapping("/updateAlbum/{idAlbum}")
	public void updateAlbum(@PathVariable("idAlbum") Long id_album, @RequestBody Album album) {
		albumService.updateAlbum(id_album, album);
	}

}
