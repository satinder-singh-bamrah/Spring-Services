package com.bsoft.mediaservice.modal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document("album")
public class Album {
    @Id
    private ObjectId _id;
    private int identifier;
    private String album_name;
    private String summary;
}
