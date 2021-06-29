package com.bsoft.mediaservice.repository;

import com.bsoft.mediaservice.modal.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository <Genre, Integer> {
}
