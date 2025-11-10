package org.example.albumservice.controllers;

import java.util.List;

import org.example.albumservice.dtos.ShowAlbumDTO;
import org.example.albumservice.services.albums.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AlbumController
 */
@RestController
@RequestMapping("/album")
public class AlbumController {

    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<ShowAlbumDTO>> getAlbums(){
        return ResponseEntity.ok(albumService.getAllAlbums());
    }
}
