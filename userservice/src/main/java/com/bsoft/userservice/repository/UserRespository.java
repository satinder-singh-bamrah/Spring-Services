package com.bsoft.userservice.repository;

import com.bsoft.userservice.modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRespository extends MongoRepository<User, Integer> {

    @Query("{user_name: ?0}")
    Optional<User> getUserByUserName(String username);

    @Query("{user_id: ?0}")
    Optional<User> getUserById(String id);

}
