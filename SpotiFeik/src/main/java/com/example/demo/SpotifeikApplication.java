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
//			TrackAuthorRepo trackAuthorRepo, TrackPlaylistRepo trackPlaylistRepo, RoleRepository roleRepo) {
//		return args -> {
//
//			// Album creation
//			Album album1 = new Album("Uno", 4, 15.44, "2022");
//			Album album2 = new Album("Due", 5, 15.44, "2014");
//			Album album3 = new Album("Tre", 18, 15.44, "2010");
//			albumRepo.save(album1);
//			albumRepo.save(album2);
//			albumRepo.save(album3);
//
//			// Artist creation
//			Artist artist1 = new Artist("Sfera Ebbasta", "21/08/1989", 10000, true);
//			Artist artist2 = new Artist("Sfera Ebbasta", "21/08/1989", 1000, true);
//			Artist artist3 = new Artist("Sfera Ebbasta", "21/08/1989", 1679, true);
//			Artist artist4 = new Artist("Sfera Ebbasta", "21/08/1989", 14458, true);
//			artistRepo.save(artist1);
//			artistRepo.save(artist2);
//			artistRepo.save(artist3);
//			artistRepo.save(artist4);
//
//			// Author creation
//			Author author1 = new Author("Lucio Dalla", "21/08/1989");
//			Author author2 = new Author("Lucio Dalla", "21/08/1989");
//			Author author3 = new Author("Lucio Dalla", "21/08/1989");
//			Author author4 = new Author("Lucio Dalla", "21/08/1989");
//			authorRepo.save(author1);
//			authorRepo.save(author2);
//			authorRepo.save(author3);
//			authorRepo.save(author4);
//
//			// Lyrics creation
//			Lyrics lyrics1 = new Lyrics("ueue");
//			Lyrics lyrics2 = new Lyrics("SkeSke");
//			Lyrics lyrics3 = new Lyrics("addio");
//			Lyrics lyrics4 = new Lyrics("statt buon");
//			lyricsRepo.save(lyrics1);
//			lyricsRepo.save(lyrics2);
//			lyricsRepo.save(lyrics3);
//			lyricsRepo.save(lyrics4);
//
//			// Playlist creation
//			Playlist playlist1 = new Playlist(52, 10, "Seems hopeful");
//			Playlist playlist2 = new Playlist(1, 2, "Seems hopeful");
//			Playlist playlist3 = new Playlist(1, 2, "Seems hopeful");
//			Playlist playlist4 = new Playlist(1, 2, "Seems hopeful");
//			playlistRepo.save(playlist1);
//			playlistRepo.save(playlist2);
//			playlistRepo.save(playlist3);
//			playlistRepo.save(playlist4);
//
//			// Track creation
//			Track track1 = new Track("Uamn", 3, 10000, true, "dataRilascio", album1, lyrics1);
//			Track track2 = new Track("Mia", 3, 10000, true, "dataRilascio", album2, lyrics2);
//			Track track3 = new Track("Tua", 3, 10000, true, "dataRilascio", album3, lyrics3);
//			Track track4 = new Track("Nostra", 3, 10000, true, "dataRilascio", album1, lyrics4);
//			trackRepo.save(track1);
//			trackRepo.save(track2);
//			trackRepo.save(track3);
//			trackRepo.save(track4);
//
//			// TrackArtist creation
//			TrackArtist trackArtist1 = new TrackArtist(track1, artist2);
//			TrackArtist trackArtist2 = new TrackArtist(track2, artist2);
//			TrackArtist trackArtist3 = new TrackArtist(track3, artist1);
//			TrackArtist trackArtist4 = new TrackArtist(track4, artist3);
//			trackArtistRepo.save(trackArtist1);
//			trackArtistRepo.save(trackArtist2);
//			trackArtistRepo.save(trackArtist3);
//			trackArtistRepo.save(trackArtist4);
//
//			// TrackAuthor creation
//			TrackAuthor trackAuthor1 = new TrackAuthor(track1, author2);
//			TrackAuthor trackAuthor2 = new TrackAuthor(track2, author1);
//			TrackAuthor trackAuthor3 = new TrackAuthor(track3, author1);
//			TrackAuthor trackAuthor4 = new TrackAuthor(track4, author4);
//			trackAuthorRepo.save(trackAuthor1);
//			trackAuthorRepo.save(trackAuthor2);
//			trackAuthorRepo.save(trackAuthor3);
//			trackAuthorRepo.save(trackAuthor4);
//
//			// TrackPlaylist creation
//			TrackPlaylist trackPlaylist1 = new TrackPlaylist(track1, playlist2);
//			TrackPlaylist trackPlaylist2 = new TrackPlaylist(track2, playlist1);
//			TrackPlaylist trackPlaylist3 = new TrackPlaylist(track3, playlist4);
//			TrackPlaylist trackPlaylist4 = new TrackPlaylist(track4, playlist3);
//			trackPlaylistRepo.save(trackPlaylist1);
//			trackPlaylistRepo.save(trackPlaylist2);
//			trackPlaylistRepo.save(trackPlaylist3);
//			trackPlaylistRepo.save(trackPlaylist4);
//
//			// Role creation
//			Role admin = new Role(ERole.ROLE_ADMIN);
//			Role user = new Role(ERole.ROLE_USER);
//			roleRepo.save(admin);
//			roleRepo.save(user);
//
//		};
//	}

}
