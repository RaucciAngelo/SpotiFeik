package com.example.demo.model;

import javax.persistence.*;

@Entity
public class TrackPlaylist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Track idTrack;

    @ManyToOne(fetch = FetchType.LAZY)
    private Playlist idPlaylist;


    public TrackPlaylist(Track idTrack, Playlist idPlaylist) {
        this.idTrack = idTrack;
        this.idPlaylist = idPlaylist;
    }

    public TrackPlaylist() {
    }

    public Track getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(Track idTrack) {
        this.idTrack = idTrack;
    }

    public Playlist getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Playlist idPlaylist) {
        this.idPlaylist = idPlaylist;
    }
}
