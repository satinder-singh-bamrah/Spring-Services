package com.bsoft.userservice.modal;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document("User")
public class User {
    @Id
    private ObjectId _id;
    private String user_id;
    private String user_name;
    private String password;
    private String first_name;
    private String last_name;
    private String email;
    private int user_type;
    private String gender;
}
