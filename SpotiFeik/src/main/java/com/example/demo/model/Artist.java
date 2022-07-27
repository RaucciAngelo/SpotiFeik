package com.example.demo.model;

 

import java.util.List;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

 

@Entity
public class Artist {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    private String  name;
    private String  birthdate;
    private int     viewers;
    private boolean verified;
    @ManyToMany
    @JoinColumn (name = "track")
    private List <Track> track;
    
    
    public Artist() {
        super();
    }
    
    public Artist(String name, String birthdate, int viewers, boolean verified, List <Track> track) {
        super();
        this.name = name;
        this.birthdate = birthdate;
        this.viewers = viewers;
        this.verified = verified;
        this.track = track;
    }

 

    public Long getId() {
        return id;
    }

 

    public void setId_artista(Long id) {
        this.id = id;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getBirthdate() {
        return birthdate;
    }

 

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

 

    public int getViewers() {
        return viewers;
    }

 

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

 

    public boolean getVerified() {
        return verified;
    }

 

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

 

    public List<Track> getTrack() {
        return track;
    }

 

    public void setTrack(List<Track> track) {
        this.track = track;
    }
}