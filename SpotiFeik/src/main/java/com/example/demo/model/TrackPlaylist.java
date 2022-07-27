package com.example.demo.model;

import javax.persistence.*;

@Entity
public class TrackPlaylist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "track_id")
	private Track track;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "playlist_id")
	private Playlist playlist;

	public TrackPlaylist(Track track, Playlist playlist) {
		this.track = track;
		this.playlist = playlist;
	}

	public TrackPlaylist() {
	}

	public Track getIdTrack() {
		return track;
	}

	public void setIdTrack(Track track) {
		this.track = track;
	}

	public Playlist getIdPlaylist() {
		return playlist;
	}

	public void setIdPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
