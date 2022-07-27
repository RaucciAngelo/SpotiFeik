package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TrackPlaylistService;

@RestController
@RequestMapping("/api/songplaylist")
public class TrackPlaylistController {
	@Autowired
	TrackPlaylistService trackPlaylistService;

	@PostMapping("/addTrackToPlaylist/{idTrack}/{idPlaylist}")
	public void addSongToArtist(@PathVariable("idTrack") Long idTrack, @PathVariable("idPlaylist") Long idPlaylist) {
		trackPlaylistService.addTrackToPlaylist(idTrack, idPlaylist);
	}

	@DeleteMapping("/deleteTrackFromPlaylist/{idTrack}/{idPlaylist}")
	public void deleteTrackFromArtist(@PathVariable("idTrack") Long idTrack,
			@PathVariable("idPlaylist") Long idPlaylist) {
		trackPlaylistService.deleteTrackFromPlaylist(idTrack, idPlaylist);
	}

	@DeleteMapping("/deleteThePlaylist/{idPlaylist}")
	public void deleteArtistAndHisTracks(@PathVariable("idPlaylist") Long idPlaylist) {
		trackPlaylistService.deleteThePlaylist(idPlaylist);
	}

	@PutMapping("/updatePlaylist/{idTrackPlaylist}/{idTrack}/{idPlaylist}")
	public void updateTrack(@PathVariable("idTrackPlaylist") Long idTrackPlaylist,
			@PathVariable("idTrack") Long idTrack, @PathVariable("idPlaylist") Long idPlaylist) {
		trackPlaylistService.updatePlaylist(idTrackPlaylist, idTrack, idPlaylist);
	}
}
