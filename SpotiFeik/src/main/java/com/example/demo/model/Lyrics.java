package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lyrics {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String testo;
	
	@OneToOne(mappedBy = "lyrics")
	private Track track;

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}

	public Lyrics(String testo, Track track) {
		super();
		this.testo = testo;
		this.track = track;
	}
	
	public Lyrics() {
		super();
	}
}
