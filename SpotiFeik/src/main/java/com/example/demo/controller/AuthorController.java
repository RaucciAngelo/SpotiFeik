package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping("/getAllAuthors")
	public List<Author> getAllAuthors() {
		return authorService.getAllAuthors();
	}

	@PostMapping("/addAuthor")
	public void addAuthor(@RequestBody Author author) {
		authorService.saveAuthor(author);
	}

	@DeleteMapping("/deleteAuthor/{​​​​​​id}​​​​​​")
	public void deleteAuthor(@PathVariable("id") Long id) {
		authorService.deleteAuthor(id);
	}

	@PutMapping("/updateAuthor/{​​​​​​id}​​​​​​")
	public void updateAuthor(@PathVariable("id") Long id, @RequestBody Author author) {
		authorService.updateAuthor(id, author);
	}
}
