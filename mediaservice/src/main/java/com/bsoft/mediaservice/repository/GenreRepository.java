package com.bsoft.mediaservice.repository;

import com.bsoft.mediaservice.modal.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface GenreRepository extends MongoRepository <Genre, Integer> {
    @Query("{id: ?0}")
    List<Genre> getGenreById(Integer isbn);

}
