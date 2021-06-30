package com.bsoft.mediaservice.controller;

import com.bsoft.mediaservice.modal.Media;
import com.bsoft.mediaservice.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {
    @Autowired
    private MediaService service;

    @GetMapping("")
    public List<Media> getAllMedia(){
        return service.getMediaList();
    }

    @GetMapping("/play/{id}")
    public String playMedia(@PathVariable("id") String isbn, @RequestHeader("user_id") String userId) {
        System.out.printf("PlayMedia with ID: %s\n", isbn);
        System.out.printf("PlayMedia with for User: %s\n", userId);
        return service.getMediaByISBN(isbn);
    }
}
