package com.example.demo.model;


public class Track {


import java.util.List;

import javax.persistence.*;

@Entity
public class Track {

	// attribute
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private int duration;
	private int plays;
	private boolean explicit;
	private String releaseDate;

	@OneToMany(mappedBy = "idtrack")
	private List<TrackArtist> artists;

	@OneToMany(mappedBy = "idtrack")
	private List<TrackPlaylist> playlists;

	@OneToOne(mappedBy = "idtrack")
	private Lyrics lyrics;

	// contructor
	public Track() {
		super();
	}

	public Track(String title, int duration, int plays, boolean explicit, String releaseDate, Lyrics lyrics) {
		super();
		this.title = title;
		this.duration = duration;
		this.plays = plays;
		this.explicit = explicit;
		this.releaseDate = releaseDate;
		this.lyrics = lyrics;
	}

	// get e set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPlays() {
		return plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}

	public boolean isExplicit() {
		return explicit;
	}

	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<TrackArtist> getArtists() {
		return artists;
	}

	public void setArtists(List<TrackArtist> artists) {
		this.artists = artists;
	}

	public List<TrackPlaylist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<TrackPlaylist> playlists) {
		this.playlists = playlists;
	}

	public Lyrics getLyrics() {
		return lyrics;
	}

	public void setLyrics(Lyrics lyrics) {
		this.lyrics = lyrics;
	}


}
