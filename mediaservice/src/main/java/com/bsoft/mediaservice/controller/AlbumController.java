package com.bsoft.mediaservice.controller;

import com.bsoft.mediaservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bsoft.mediaservice.modal.Album;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumRepository repository;

    @GetMapping("/albums")
    public List<Album> getAlbum() {
        return repository.findAll();
    }
}
