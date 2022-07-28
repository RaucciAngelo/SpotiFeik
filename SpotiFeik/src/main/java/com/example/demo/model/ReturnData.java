package com.example.demo.model;

import java.util.List;

public class ReturnData {

	private List<Author> author;
	private List<Artist> artist;

	public ReturnData() {
		super();
	}

	public ReturnData(List<Author> list, List<Artist> list2) {
		super();
		this.author = list;
		this.artist = list2;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public List<Artist> getArtist() {
		return artist;
	}

	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}

}
