package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.repository.*;

@Service
public class TrackAuthorService {

	@Autowired
	private TrackAuthorRepo trackAuthorRepo;

	@Autowired
	private TrackRepo trackRepo;

	@Autowired
	private AuthorRepo authorRepo;

	public List<TrackAuthor> getAllTrackAuthors() {
		return trackAuthorRepo.findAll();
	}

	public void save(Long idTrack, Long idAuthor) {
		TrackAuthor trackAuthor = new TrackAuthor(trackRepo.getReferenceById(idTrack),
				authorRepo.getReferenceById(idAuthor));
		trackAuthorRepo.save(trackAuthor);
	}

	public void delete(Long id) {
		trackAuthorRepo.deleteById(id);
	}

	public void update(Long idTrackAuthor, Long idTrack, Long idAuthor) {
		TrackAuthor updateTrackAuthor = trackAuthorRepo.getReferenceById(idTrackAuthor);
		updateTrackAuthor = new TrackAuthor(trackRepo.getReferenceById(idTrack), authorRepo.getReferenceById(idAuthor));

		trackAuthorRepo.save(updateTrackAuthor);

	}

}
