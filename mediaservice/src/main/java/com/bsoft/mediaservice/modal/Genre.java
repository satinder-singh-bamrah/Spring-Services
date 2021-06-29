package com.bsoft.mediaservice.modal;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document("genre")
public class Genre {

    @Id
    private ObjectId _id;
    private int id;
    private String genre;
}
