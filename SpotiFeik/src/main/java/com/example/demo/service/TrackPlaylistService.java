package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Playlist;
import com.example.demo.model.Track;
import com.example.demo.model.TrackPlaylist;
import com.example.demo.repository.PlaylistRepo;
import com.example.demo.repository.TrackPlaylistRepo;
import com.example.demo.repository.TrackRepo;

@Service
public class TrackPlaylistService {

	@Autowired
	TrackPlaylistRepo trackPlaylistRepo;

	@Autowired
	TrackRepo trackRepo;

	@Autowired
	PlaylistRepo playlistRepo;

	public void addTrackToPlaylist(Long idTrack, Long idArtist) {
		Track track = trackRepo.getReferenceById(idTrack);
		Playlist playlist = playlistRepo.getReferenceById(idArtist);
		TrackPlaylist trackPlaylist = new TrackPlaylist(track, playlist);
		trackPlaylistRepo.save(trackPlaylist);
	}

	public void deleteTrackFromPlaylist(Long idTrack, Long idPlaylist) {
		trackPlaylistRepo.deleteTrackFromPlaylists(idTrack, idPlaylist);
	}

	public void deleteThePlaylist(Long idPlaylist) {
		trackPlaylistRepo.deletePlaylist(idPlaylist);
	}

	public void updatePlaylist(Long idTrackPlaylist, Long idTrack, Long idPlaylist) {
		TrackPlaylist updateTrackPlaylist = trackPlaylistRepo.getReferenceById(idTrackPlaylist);
		updateTrackPlaylist = new TrackPlaylist(trackRepo.getReferenceById(idTrack), playlistRepo.getReferenceById(idPlaylist));

		trackPlaylistRepo.save(updateTrackPlaylist);
	}
}
