package com.example.demo.controller;

import com.example.demo.model.Track;
import com.example.demo.model.TrackArtist;
import com.example.demo.model.TrackPlaylist;
import com.example.demo.service.TrackArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songartist")
public class TrackArtistController {

    @Autowired
    TrackArtistService trackArtistService;


    @PostMapping("/addTrackToArtist/{idTrack}/{idArtist}")
    public void addSongToArtist(@PathVariable("idTrack")Long idTrack, @PathVariable("idArtist")Long idArtist){
        trackArtistService.addTrackToArtist(idTrack, idArtist);
    }

    @DeleteMapping("/deleteTrackFromArtist/{idTrack}/{idArtist}")
    public void deleteTrackFromArtist(@PathVariable("idTrack")Long idTrack, @PathVariable("idArtist")Long idArtist){
        trackArtistService.deleteTrackFromArtist(idTrack, idArtist);
    }

    @DeleteMapping("/deleteArtistAndHisTracks/{idArtist}")
    public void deleteArtistAndHisTracks(@PathVariable("idArtist")Long idArtist){
        trackArtistService.deleteArtistAndHisTracks(idArtist);
    }

    @PutMapping("/updateTrack/{id}")
    public void updateTrack(@PathVariable("id")Long id, @RequestBody TrackArtist trackArtist){
        trackArtistService.updateTrack(id, trackArtist);
    }
}
