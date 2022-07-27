package com.example.demo.service;

import com.example.demo.model.Artist;
import com.example.demo.model.Track;
import com.example.demo.model.TrackArtist;
import com.example.demo.repository.ArtistRepo;
import com.example.demo.repository.TrackArtistRepo;
import com.example.demo.repository.TrackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackArtistService {
    @Autowired
    TrackArtistRepo trackArtistRepo;
    @Autowired
    TrackRepo trackRepo;
    @Autowired
    ArtistRepo artistRepo;

    public void addTrackToArtist(Long idTrack, Long idArtist) {
        Track track = trackRepo.getReferenceById(idTrack);
        Artist artist = artistRepo.getReferenceById(idArtist);
        TrackArtist trackArtist= new TrackArtist(track, artist);
        trackArtistRepo.save(trackArtist);
    }

    public void deleteTrackFromArtist(Long idTrack, Long idArtist) {
        trackArtistRepo.deleteTrackFromArtists(idTrack, idArtist);
    }

    public void deleteArtistAndHisTracks(Long idArtist) {
        trackArtistRepo.deleteArtistAndTracks(idArtist);
    }

    public void updateTrack(Long id, TrackArtist trackArtist) {
        TrackArtist updateTrackArtist = trackArtistRepo.getReferenceById(id);
        updateTrackArtist.setIdTrack(trackArtist.getIdTrack());
        updateTrackArtist.setIdArtist(trackArtist.getIdArtist());
        trackArtistRepo.save(updateTrackArtist);
    }
}
