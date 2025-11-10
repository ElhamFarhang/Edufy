package org.example.songservice.services.songs;

import java.util.List;
import java.util.UUID;

import org.example.songservice.dtos.AddSongDTO;
import org.example.songservice.dtos.ShowSongDTO;

public interface SongService {
    List<ShowSongDTO> getAllSongs();
    ShowSongDTO getSongByUUID(UUID uuid);
    ShowSongDTO addSong(AddSongDTO dto);
}
