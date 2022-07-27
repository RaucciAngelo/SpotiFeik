package com.example.demo.model;

public class ReturnData {

	private Author author;
	private Artist artist;

	public ReturnData() {
		super();
	}

	public ReturnData(Author author, Artist artist) {
		super();
		this.author = author;
		this.artist = artist;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

}
