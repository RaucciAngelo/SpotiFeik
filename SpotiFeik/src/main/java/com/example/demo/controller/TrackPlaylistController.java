package com.example.demo.controller;


import com.example.demo.model.TrackPlaylist;
import com.example.demo.service.TrackPlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/songplaylist")
public class TrackPlaylistController {
    @Autowired
    TrackPlaylistService trackPlaylistService;

    @PostMapping("/addTrackToPlaylist/{idTrack}/{idPlaylist}")
    public void addSongToArtist(@PathVariable("idTrack")Long idTrack, @PathVariable("idPlaylist")Long idPlaylist){
        trackPlaylistService.addTrackToPlaylist(idTrack, idPlaylist);
    }

    @DeleteMapping("/deleteTrackFromPlaylist/{idTrack}/{idPlaylist}")
    public void deleteTrackFromArtist(@PathVariable("idTrack")Long idTrack, @PathVariable("idPlaylist")Long idPlaylist){
        trackPlaylistService.deleteTrackFromPlaylist(idTrack, idPlaylist);
    }

    @DeleteMapping("/deleteThePlaylist/{idPlaylist}")
    public void deleteArtistAndHisTracks(@PathVariable("idPlaylist")Long idPlaylist){
        trackPlaylistService.deleteThePlaylist(idPlaylist);
    }

    @PutMapping("/updatePlaylist/{id}")
    public void updateTrack(@PathVariable("id")Long id, @RequestBody TrackPlaylist playlist){
        trackPlaylistService.updatePlaylist(id, playlist);
    }
}
