package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;
import com.example.demo.repository.ArtistRepo;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepo artistRepo;

	public List<Artist> getAllArtists() {
		return artistRepo.findAll();
	}

	public void saveArtist(Artist artist) {
		artist = new Artist(artist.getName(), artist.getBirthdate(), artist.getViewers(), artist.isVerified());
		artistRepo.save(artist);
	}

	public void deleteArtist(Long id) {
		artistRepo.deleteById(id);
	}

	public void updateArtist(Long id, Artist artist) {
		Artist updateArtist = artistRepo.getReferenceById(id);
		updateArtist = new Artist(artist.getName(), artist.getBirthdate(), artist.getViewers(), artist.isVerified());
		artistRepo.save(updateArtist);
	}
}