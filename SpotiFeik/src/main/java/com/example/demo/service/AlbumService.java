package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepo;
@Service
public class AlbumService {

	@Autowired
	private AlbumRepo albumRepo;
	
	
	
	public List<Album> getAllAlbum() {
		return albumRepo.findAll();
	}



	@SuppressWarnings("deprecation")
	public Album getAlbumId(Long id_album) {
		return albumRepo.getById(id_album);
	}



	public void saveAlbum(Album album, Long id_album) {
          album= new Album(album.getTitle(),album.getN_song(),album.getDuration(),album.getYear_release());
          albumRepo.save(album);
	}

     public void deleteAlbum(Long id_album) {
    	 albumRepo.deleteById(id_album);
	}



	public void updateAlbum(Long id_album, Album album) {
          Album updateAlbum = albumRepo.getReferenceById(id_album);
          updateAlbum = new Album (album.getTitle(),album.getN_song(),album.getDuration(),album.getYear_release());
          albumRepo.save(updateAlbum);
	}
 
	
	
}
