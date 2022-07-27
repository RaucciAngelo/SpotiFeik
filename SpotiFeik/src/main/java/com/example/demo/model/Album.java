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
	private Long id;
	private String title;
	private int nSong;
	private double duration;
	private String yearRelease;
	
	@OneToMany(mappedBy="album")
	private List<Track> track;
	
	public Album() {
		super();
	}


	public Album(String title, int nSong, double duration, String yearRelease) {
		super();
		this.title = title;
		this.nSong = nSong;
		this.duration = duration;
		this.yearRelease = yearRelease;
	}


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


	public int getNSong() {
		return nSong;
	}


	public void setNSong(int nSong) {
		this.nSong = nSong;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	public String getYearRelease() {
		return yearRelease;
	}


	public void setYear_release(String yearRelease) {
		this.yearRelease = yearRelease;
	}

	
}