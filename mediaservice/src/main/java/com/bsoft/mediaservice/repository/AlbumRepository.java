package com.bsoft.mediaservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bsoft.mediaservice.modal.Album;

public interface AlbumRepository extends MongoRepository <Album, Integer> {
}
