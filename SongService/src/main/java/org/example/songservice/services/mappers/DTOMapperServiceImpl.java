package org.example.songservice.services.mappers;

import java.util.ArrayList;
import java.util.List;

import org.example.songservice.dtos.*;
import org.example.songservice.entities.Genre;
import org.example.songservice.entities.Song;
import org.springframework.stereotype.Service;

@Service
public class DTOMapperServiceImpl implements DTOMapperService {

	@Override
	public ShowSongDTO songToDTO(Song song) {

        List<String> genres = new ArrayList<>();
        ShowSongDTO dto = new ShowSongDTO();

        // dto.setUuid(song.getUuid());
        dto.setTitle(song.getTitle());
        dto.setStreamUrl(song.getUrl());

        for(Genre genre : song.getGenres()){
            genres.add(genre.getGenre());
        }
        dto.setGenres(genres);

        return dto;
	}

	@Override
	public ShowSongInfoDTO songToInfoDTO(Song song) {

        List<String> genres = new ArrayList<>();
        ShowSongInfoDTO dto = new ShowSongInfoDTO();

        // dto.setUuid(song.getUuid());
        dto.setTitle(song.getTitle());

        for(Genre genre : song.getGenres()){
            genres.add(genre.getGenre());
        }
        dto.setGenres(genres);

        return dto;
	}

	@Override
	public List<ShowSongDTO> songsToDTOList(List<Song> songs) {
        List<ShowSongDTO> dtos = new ArrayList<>();
        for(Song song : songs){
            dtos.add(songToDTO(song));
        }
        return dtos;
	}
}
