package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.*;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nTrack;
    private int duration;
    private String name;

    @OneToMany(mappedBy = "playlist")
    private List<TrackPlaylist> tracks;

    public Playlist() {
    }

    public Playlist(int nTrack, int duration, String name) {
        super();
        this.nTrack = nTrack;
        this.duration = duration;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

        public int getnPiece() {
        return nTrack;
    }

    public void setnPiece(int nPiece) {
        this.nTrack = nPiece;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnTrack() {
        return nTrack;
    }

    public void setnTrack(int nTrack) {
        this.nTrack = nTrack;
    }

    public List<TrackPlaylist> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackPlaylist> tracks) {
        this.tracks = tracks;
    }

        

}