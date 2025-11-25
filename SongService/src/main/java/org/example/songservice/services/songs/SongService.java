package org.example.songservice.services.songs;

import java.util.List;
import java.util.UUID;

import org.example.songservice.dtos.AddSongDTO;
import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.dtos.ShowSongInfoDTO;
import org.example.songservice.dtos.SongIdGenreDTO;

public interface SongService {
    List<ShowSongDTO> getAllSongs();
    List<ShowSongDTO> getSongs(List<UUID> uuids);
    ShowSongInfoDTO getSongByUUID(UUID uuid);
    String getSongTitle(UUID uuid);
    ShowSongDTO addSong(AddSongDTO dto);

    SongIdGenreDTO getSongIdAndGenre(String url);
}
