package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Lyrics;
import com.example.demo.service.LyricsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class LyricsController {

    @Autowired
    private LyricsService lyrics_service;

    @GetMapping("/getAllLyrics")
    public List<Lyrics> getAllLyrics(){
        return lyrics_service.getAllLyrics();
    }

    @PostMapping("/addLyrics")
    public void addLyrics(@RequestBody Lyrics lyrics) {
        lyrics_service.saveLyrics(lyrics);
    }

    @DeleteMapping("/deleteLyrics/{id}")
    public void deleteLyrics(@PathVariable("id") Long id) {
        lyrics_service.deleteLyricsById(id);
    }

    @PutMapping("/updateLyrics/{id}")
    public void updateLyrics(@PathVariable("id") Long id, @RequestBody Lyrics lyrics) {
        lyrics_service.update(id, lyrics);
    }

}