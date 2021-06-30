package com.bsoft.mediaservice.modal;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document("Media")
public class Media {
    @Id
    private ObjectId _id;
    private String isbn;
    private String title;
    private String summary;
    private String thumbnail;
}
