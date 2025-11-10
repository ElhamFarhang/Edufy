package org.example.songservice.services.songs;

import java.util.List;
import java.util.UUID;

import org.example.songservice.dtos.AddSongDTO;
import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.entities.Song;
import org.example.songservice.repositories.SongRepository;
import org.example.songservice.services.mappers.DTOMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepo;
    private final DTOMapperService mapperService;

    @Autowired
    public SongServiceImpl(SongRepository songRepo, DTOMapperService mapperService) {
        this.songRepo = songRepo;
        this.mapperService = mapperService;
    }

	@Override
	public List<ShowSongDTO> getAllSongs() {
        return mapperService.songsToDTOList(songRepo.findAll());
	}

	@Override
	public ShowSongDTO getSongByUUID(UUID uuid) {
        System.out.println("finding by " + uuid);
        Song foundSong = new Song();
        foundSong = songRepo.findById(uuid).get();
        return mapperService.songToDTO(foundSong);
	}

	@Override
	public ShowSongDTO addSong(AddSongDTO dto) {
        Song song = new Song();
        song.setUrl(dto.getStreamUrl());
        song.setTitle(dto.getTitle());
        return mapperService.songToDTO(songRepo.save(song));
	}
}
