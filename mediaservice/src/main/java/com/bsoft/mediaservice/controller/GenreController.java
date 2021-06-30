package com.bsoft.mediaservice.controller;

import com.bsoft.mediaservice.modal.Genre;
import com.bsoft.mediaservice.repository.GenreRepository;
import com.bsoft.mediaservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/genre")
public class GenreController {
    @Autowired
    private GenreRepository repository;
    //private GenreService service;

    @GetMapping("")
    public List<Genre> getGenre(){
        return repository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Genre> createGenre(@RequestBody Genre genre) {
        List<Genre> list = repository.getGenreById(genre.getId());

        if (list.size() > 0) {
            System.out.println("createGenre::Genre already exists");
            return new ResponseEntity<>(null, HttpStatus.IM_USED);
        }
        else {
            try {
                Genre _genre = repository.save(new Genre(genre.getId(), genre.getGenre()));
                System.out.println("createGenre::Genre Created");
                return new ResponseEntity<>(_genre, HttpStatus.CREATED);
            } catch (Exception e) {
                System.out.println("createGenre::Error while creating genre");
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateGenre(@PathVariable("id") int id, @RequestBody Genre genre) {
        List<Genre> list = repository.getGenreById(id);

        if (list.size() == 0) {
            System.out.println("updateGenre::Genre not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else if (list.size()  > 1) {
            System.out.println("updateGenre::Multiple Genre found. Can't update !");
            return new ResponseEntity<>(HttpStatus.MULTI_STATUS);
        }

        Genre _genre = list.get(0);
        _genre.setGenre(genre.getGenre());
        repository.save(_genre);
        System.out.printf("updateGenre::Genre update for id: %d\n", _genre.getId());
        return new ResponseEntity<>(genre, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Genre> deleteGenre(@PathVariable("id") int id){
        List<Genre> list = repository.getGenreById(id);

        if (list.size() == 0) {
            System.out.println("deleteGenre::Genre not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        for (Genre _genre:
                list) {
            repository.delete(_genre);
            System.out.printf("deleteGenre::Genre Deleted with ID: %d\n", _genre.getId());
        }
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
