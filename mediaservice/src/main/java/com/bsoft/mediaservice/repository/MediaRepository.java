package com.bsoft.mediaservice.repository;

import com.bsoft.mediaservice.modal.Genre;
import com.bsoft.mediaservice.modal.Media;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MediaRepository extends MongoRepository <Media, Integer> {
    @Query("{isbn: ?0}")
    List<Media> getMediaByISBN(String isbn);
}
