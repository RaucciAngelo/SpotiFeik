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
	private AlbumService albumservice;
	
	@GetMapping("/getAllAlbums")
	public List<Album> GetAllAlbum(){
		return albumservice.getAllAlbum();
	}
	@GetMapping("/getAlbumById/{id}")
	public Album getAlbumId(@PathVariable("id")Long id_album) {
		return albumservice.getAlbumId(id_album);
	}
	@PostMapping("/addNewAlbum/{id}")
	public void addNew(@RequestBody Album album,@PathVariable("id")Long id_album) {
		albumservice.saveAlbum(album,id_album);
		}
	@DeleteMapping("/deleteAlbum/{id}")
	public void deleteAlbum(@PathVariable("id")Long id_album) {
		albumservice.deleteAlbum(id_album);
	}
	@PutMapping("/updateAlbum/{idAlbum}")
	public void updateAlbum(@PathVariable("idAlbum")Long id_album,@RequestBody Album album) {
		albumservice.updateAlbum(id_album,album);
	}
	
}
