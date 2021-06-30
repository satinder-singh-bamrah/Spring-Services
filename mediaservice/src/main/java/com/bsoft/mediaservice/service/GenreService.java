package com.bsoft.mediaservice.service;

import com.bsoft.mediaservice.modal.Genre;
import com.bsoft.mediaservice.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class GenreService {
    //@Autowired
    private GenreRepository repository;

    public List<Genre> getGenreList() {
        return repository.findAll();
    }

    public ResponseEntity<Genre> createGenre(Genre genre) {
        try {
            //Genre _genre = repository.save(new Genre(genre.getId(), genre.getGenre()), false);
            Genre _genre = repository.insert(new Genre(genre.getId(), genre.getGenre()));
            return new ResponseEntity<>(_genre, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
