package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.*;
import com.example.demo.repository.*;

@SpringBootApplication
public class SpotifeikApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifeikApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(AlbumRepo albumRepo, ArtistRepo artistRepo, AuthorRepo authorRepo,
//			LyricsRepo lyricsRepo, PlaylistRepo playlistRepo, TrackRepo trackRepo, TrackArtistRepo trackArtistRepo,
//			TrackAuthorRepo trackAuthorRepo, TrackPlaylistRepo trackPlaylistRepo) {
//		return args -> {
//
//			// Album creation
//			Album album1 = new Album();
//			Album album2 = new Album();
//			Album album3 = new Album();
//			albumRepo.save(album1);
//			albumRepo.save(album2);
//			albumRepo.save(album3);
//
//			// Artist creation
//			Artist artist1 = new Artist();
//			Artist artist2 = new Artist();
//			Artist artist3 = new Artist();
//			Artist artist4 = new Artist();
//			artistRepo.save(artist1);
//			artistRepo.save(artist2);
//			artistRepo.save(artist3);
//			artistRepo.save(artist4);
//
//			// Author creation
//			Author author1 = new Author();
//			Author author2 = new Author();
//			Author author3 = new Author();
//			Author author4 = new Author();
//			authorRepo.save(author1);
//			authorRepo.save(author2);
//			authorRepo.save(author3);
//			authorRepo.save(author4);
//
//			// Lyrics creation
//			Lyrics lyrics1 = new Lyrics();
//			Lyrics lyrics2 = new Lyrics();
//			Lyrics lyrics3 = new Lyrics();
//			Lyrics lyrics4 = new Lyrics();
//			lyricsRepo.save(lyrics1);
//			lyricsRepo.save(lyrics2);
//			lyricsRepo.save(lyrics3);
//			lyricsRepo.save(lyrics4);
//
//			// Playlist creation
//			Playlist playlist1 = new Playlist();
//			Playlist playlist2 = new Playlist();
//			Playlist playlist3 = new Playlist();
//			Playlist playlist4 = new Playlist();
//			playlistRepo.save(playlist1);
//			playlistRepo.save(playlist2);
//			playlistRepo.save(playlist3);
//			playlistRepo.save(playlist4);
//
//			// Track creation
//			Track track1 = new Track();
//			Track track2 = new Track();
//			Track track3 = new Track();
//			Track track4 = new Track();
//			trackRepo.save(track1);
//			trackRepo.save(track2);
//			trackRepo.save(track3);
//			trackRepo.save(track4);
//
//			// TrackArtist creation
//			TrackArtist trackArtist1 = new TrackArtist();
//			TrackArtist trackArtist2 = new TrackArtist();
//			TrackArtist trackArtist3 = new TrackArtist();
//			TrackArtist trackArtist4 = new TrackArtist();
//			trackArtistRepo.save(trackArtist1);
//			trackArtistRepo.save(trackArtist2);
//			trackArtistRepo.save(trackArtist3);
//			trackArtistRepo.save(trackArtist4);
//
//			// TrackAuthor creation
//			TrackAuthor trackAuthor1 = new TrackAuthor();
//			TrackAuthor trackAuthor2 = new TrackAuthor();
//			TrackAuthor trackAuthor3 = new TrackAuthor();
//			TrackAuthor trackAuthor4 = new TrackAuthor();
//			trackAuthorRepo.save(trackAuthor1);
//			trackAuthorRepo.save(trackAuthor2);
//			trackAuthorRepo.save(trackAuthor3);
//			trackAuthorRepo.save(trackAuthor4);
//
//			// TrackPlaylist creation
//			TrackPlaylist trackPlaylist1 = new TrackPlaylist();
//			TrackPlaylist trackPlaylist2 = new TrackPlaylist();
//			TrackPlaylist trackPlaylist3 = new TrackPlaylist();
//			TrackPlaylist trackPlaylist4 = new TrackPlaylist();
//			trackPlaylistRepo.save(trackPlaylist1);
//			trackPlaylistRepo.save(trackPlaylist2);
//			trackPlaylistRepo.save(trackPlaylist3);
//			trackPlaylistRepo.save(trackPlaylist4);
//
//		};
//	}

}
