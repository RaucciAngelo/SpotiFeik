package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Album;
import com.example.demo.model.Playlist;
import com.example.demo.repository.PlaylistRepo;

@Service
public class PlaylistService {

	@Autowired
	private PlaylistRepo playlistRepo;

	public List<Playlist> getAllPlaylist() {
		return playlistRepo.findAll();
	}

	public void savePlaylist(Playlist playlist) {
		playlistRepo.save(playlist);
	}

	public void deletePlaylist(Long id) {
		playlistRepo.deleteById(id);
	}

	public void update(Long id, Playlist playlist) {		
		Playlist updateP = playlistRepo.getReferenceById(id);
		updateP = new Playlist(playlist.getnTrack(), playlist.getDuration(), playlist.getName());
		playlistRepo.save(updateP);
	}
}