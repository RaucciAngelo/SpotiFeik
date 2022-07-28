package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String birthdate;

	@JsonIgnore
	@OneToMany(mappedBy = "author")
	private List<TrackAuthor> track;

	public Author(String name, String birthdate) {
		super();
		this.name = name;
		this.birthdate = birthdate;
	}

	public Author() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<TrackAuthor> getTrack() {
		return track;
	}

	public void setTrack(List<TrackAuthor> track) {
		this.track = track;
	}

}
