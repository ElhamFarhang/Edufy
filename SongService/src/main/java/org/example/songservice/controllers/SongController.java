package org.example.songservice.controllers;

import java.util.List;
import java.util.UUID;

import org.example.songservice.dtos.AddSongDTO;
import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.dtos.ShowSongInfoDTO;
import org.example.songservice.dtos.SongIdGenreDTO;
import org.example.songservice.services.songs.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<ShowSongDTO>> getSongs(){
        return ResponseEntity.ok(songService.getAllSongs());
    }

    @GetMapping("/songinfo/{uuid}")
    public ResponseEntity<ShowSongInfoDTO> getSongMinInfo(@PathVariable UUID uuid){
        return ResponseEntity.ok(songService.getSongByUUID(uuid));
    }

    @GetMapping("/songdetails/{uuid}")
    public ResponseEntity<ShowSongInfoDTO> getSongDetails(@PathVariable UUID uuid){
        return ResponseEntity.ok(songService.getSongByUUID(uuid));
    }

    @GetMapping("/songtitle/{uuid}")
    public ResponseEntity<String> getSongTitle(@PathVariable UUID uuid){
        return ResponseEntity.ok(songService.getSongTitle(uuid));
    }

    @PostMapping("/songcollection")
    public ResponseEntity<List<ShowSongDTO>> getSongCollection(@RequestBody List<UUID> uuids){
        return ResponseEntity.ok(songService.getSongs(uuids));
    }

    @PostMapping("/addsong")
    public ResponseEntity<ShowSongDTO> addSong(@RequestBody AddSongDTO songDTO){
        return ResponseEntity.ok(songService.addSong(songDTO));
    }

    @GetMapping("/songurl")
    public ResponseEntity<SongIdGenreDTO> getSongByUrl(@RequestParam String url) {
        return ResponseEntity.ok(songService.getSongIdAndGenre(url));
    }
}
