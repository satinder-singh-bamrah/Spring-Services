package com.bsoft.mediaservice.service;

import com.bsoft.mediaservice.modal.Media;
import com.bsoft.mediaservice.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {
    @Autowired
    private MediaRepository repository;

    public List<Media> getMediaList(){
        return repository.findAll();
    }

    public  String getMediaByISBN(String isbn) {
        List<Media> list = repository.getMediaByISBN(isbn);
        if (list.size() > 0) {
            Media media = list.get(0);
            return media.getThumbnail();
        }
        else {
            return "No Media found";
        }
    }
}
