package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.repository.*;

@Service
public class TrackService {

	@Autowired
	private TrackRepo trackRepo;

	@Autowired
	private ArtistRepo artistRepo;

	@Autowired
	private AuthorRepo authorRepo;
	
	@Autowired
	private AlbumRepo albumRepo;

	@Autowired
	private LyricsRepo lyricsRepo;

	public List<Track> getAllTracks() {
		return trackRepo.findAll();
	}

	public void save(Track track, Long idLyrics, Long idAlbum) {
		Track newTrack = new Track(track.getTitle(), track.getDuration(), track.getPlays(), track.isExplicit(),
				track.getReleaseDate(), albumRepo.getReferenceById(idAlbum), lyricsRepo.getReferenceById(idLyrics));
		trackRepo.save(newTrack);
	}

	public void delete(Long id) {
		trackRepo.deleteById(id);
	}

	public void update(Long idTrack, Track track, Long idLyrics, Long idAlbum) {
		Track updateTrack = trackRepo.getReferenceById(idTrack);
		updateTrack = new Track(track.getTitle(), track.getDuration(), track.getPlays(), track.isExplicit(),
				track.getReleaseDate(), albumRepo.getReferenceById(idAlbum), lyricsRepo.getReferenceById(idLyrics));

		trackRepo.save(updateTrack);
	}

	public List<Author> getAuthorByTrack(Long idTrack) {
		return authorRepo.getAuthorByTrack(idTrack);
	}

	public List<Artist> getArtistByTrack(Long idTrack) {
		return artistRepo.getArtistByTrack(idTrack);
	}

	public List<ReturnData> getArtistAuthorByTrack(Long idTrack) {
		
		List<ReturnData> listaArtistiAutori = new ArrayList<ReturnData>();
		
		for (Author author : authorRepo.getAuthorByTrack(idTrack)) {
			for (Artist artist : artistRepo.getArtistByTrack(idTrack)) {
				ReturnData returnData = new ReturnData(author, artist);
				listaArtistiAutori.add(returnData);
			}
		}
		
		return listaArtistiAutori;
	}

}
