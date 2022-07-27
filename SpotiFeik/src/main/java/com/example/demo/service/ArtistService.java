package com.example.demo.service;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.example.demo.model.Artist;
import com.example.demo.repository.ArtistRepo;

 

@Service
public class ArtistService {
    
     @Autowired
        private ArtistRepo artistRepo;
        public List<Artist> getAllArtists() {
            return artistRepo.findAll();
        }
        public void saveArtist(Artist artist, Long idArtist) {
            artist = new Artist(artist.getName(), artist.getBirthdate(), artist.getViewers(), artist.getVerified(), artist.getTrack());
            artistRepo.save(artist);
        }
        public void deleteArtist(Long id) {
            artistRepo.deleteById(id);
        }
        @SuppressWarnings("deprecation")
        public void updateArtist(Long id, Artist artist) {
            Artist newArtist = new Artist();
            newArtist = artistRepo.getById(id);
            newArtist.setId_artista(artist.getId());
            newArtist.setName(artist.getName());
            newArtist.setBirthdate(artist.getBirthdate());
            newArtist.setVerified(artist.getVerified());
            newArtist.setTrack(artist.getTrack());
            artistRepo.save(newArtist);
        }
    }