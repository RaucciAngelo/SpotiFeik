package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepo;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepo authorRepo;

	public List<Author> getAllAuthors() {
		return authorRepo.findAll();
	}

	public void saveAuthor(Author author) {
		author = new Author(author.getName(), author.getBirthdate());
		authorRepo.save(author);
	}

	public void deleteAuthor(Long id) {
		authorRepo.deleteById(id);
	}

	public void updateAuthor(Long id, Author author) {
		Author updateAuthor = authorRepo.getReferenceById(id);
		updateAuthor = new Author(author.getName(), author.getBirthdate());

		authorRepo.save(updateAuthor);

	}

}
