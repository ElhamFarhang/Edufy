package org.example.songservice.services.mappers;

import java.util.List;

import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.dtos.ShowSongInfoDTO;
import org.example.songservice.entities.Song;

public interface DTOMapperService {
    ShowSongDTO songToDTO(Song song);
    ShowSongInfoDTO songToInfoDTO(Song song);
    List<ShowSongDTO> songsToDTOList(List<Song> songs);
}
