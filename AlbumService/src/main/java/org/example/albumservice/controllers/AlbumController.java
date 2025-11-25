package org.example.albumservice.controllers;

import java.util.List;

import org.example.albumservice.dtos.albums.ShowAlbumFullDTO;
import org.example.albumservice.dtos.albums.ShowAlbumSimpleDTO;
import org.example.albumservice.services.albums.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AlbumController
 */
@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/getall/{details}")
    public ResponseEntity<List<?>> getAlbumsFull(@PathVariable String details){
        return ResponseEntity.ok(albumService.getAllAlbums(details));
    }
    //
    // @GetMapping("/listsimple")
    // public ResponseEntity<List<ShowAlbumSimpleDTO>> getAlbumsSimple(){
    //     return ResponseEntity.ok(albumService.getAllAlbumsSimple());
    // }
    //
    // @GetMapping("/listbasic")
    // public ResponseEntity<List<ShowAlbumFullDTO>> getAlbumsBasic(){
    //     return ResponseEntity.ok(albumService.getAllAlbums());
    // }
}
