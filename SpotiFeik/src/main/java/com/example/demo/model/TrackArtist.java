package com.example.demo.model;

import javax.persistence.*;

@Entity
public class TrackArtist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Track idTrack;

    @ManyToOne(fetch = FetchType.LAZY)
    private Artist idArtist;

    public TrackArtist(Track idTrack, Artist idArtist) {
        this.idTrack = idTrack;
        this.idArtist = idArtist;
    }

    public TrackArtist() {
    }

    public Track getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(Track idTrack) {
        this.idTrack = idTrack;
    }

    public Artist getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Artist idArtist) {
        this.idArtist = idArtist;
    }
}
