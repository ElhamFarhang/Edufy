package org.example.artistservice.controllers;

import java.util.List;
import java.util.UUID;

import org.example.artistservice.dtos.artist.ArtistInfoFullDTO;
import org.example.artistservice.services.artist.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    // @GetMapping("/artists")
    // public ResponseEntity<List<ArtistInfoFullDTO>> getArtists(){
    //     return ResponseEntity.ok(artistService.getAllArtists());
    // }

    @GetMapping("/artistname/{uuid}")
    public ResponseEntity<String> getArtistName(@PathVariable UUID uuid){
        return ResponseEntity.ok(artistService.getArtistNameByUUID(uuid));
    }
}
