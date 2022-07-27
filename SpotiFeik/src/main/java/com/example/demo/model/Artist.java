package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String birthdate;
	private int viewers;
	private boolean verified;

	@OneToMany(mappedBy = "artist")
	private List<TrackArtist> track;

	public Artist() {
		super();
	}

	public Artist(String name, String birthdate, int viewers, boolean verified) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.viewers = viewers;
		this.verified = verified;
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

	public boolean isVerified() {
		return verified;
	}
	
	public void setViewers(int viewers) {
		this.viewers = viewers;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	

	public List<TrackArtist> getTrack() {
		return track;
	}

	

	public void setTrack(List<TrackArtist> track) {
		this.track = track;
	}
}