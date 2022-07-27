package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Album {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_album;
	private String title;
	private int n_song;
	private double duration;
	private String year_release;
	
	
	@OneToMany(mappedBy="track")
	private List<Track> track;
	
	public Album() {
		super();
	}


	public Album(String title, int n_song, double duration, String year_release) {
		super();
		this.title = title;
		this.n_song = n_song;
		this.duration = duration;
		this.year_release = year_release;
	}


	public Long getId_album() {
		return id_album;
	}


	public void setId_album(Long id_album) {
		this.id_album = id_album;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getN_song() {
		return n_song;
	}


	public void setN_song(int n_song) {
		this.n_song = n_song;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	public String getYear_release() {
		return year_release;
	}


	public void setYear_release(String year_release) {
		this.year_release = year_release;
	}

	
}