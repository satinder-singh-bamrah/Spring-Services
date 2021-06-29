package com.bsoft.mediaservice.repository;

import com.bsoft.mediaservice.modal.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository <Artist,Integer> {
}
