package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Track {

	// attribute
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private double duration;
	private int plays;
	private boolean explicit;
	private String releaseDate;

	@OneToMany(mappedBy = "track")
	private List<TrackArtist> artists;
	
	@OneToMany(mappedBy = "track")
	private List<TrackAuthor> authors;

	@OneToMany(mappedBy = "track")
	private List<TrackPlaylist> playlists;

	@OneToOne
	@JoinColumn(name = "lyrics_id")
	private Lyrics lyrics;
	
	@ManyToOne
	@JoinColumn(name = "album_id")
	private Album album;

	// contructor
	public Track() {
		super();
	}

	public Track(String title, double duration, int plays, boolean explicit, String releaseDate, Album album, Lyrics lyrics) {
		super();
		this.title = title;
		this.duration = duration;
		this.plays = plays;
		this.explicit = explicit;
		this.releaseDate = releaseDate;
		this.album = album;
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
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
	
	public List<TrackAuthor> getAuthors() {
		return authors;
	}

	public void setAuthors(List<TrackAuthor> authors) {
		this.authors = authors;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}


}
