package org.example.songservice.services.songs;

import java.util.List;
import java.util.UUID;

import org.example.songservice.dtos.AddSongDTO;
import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.dtos.ShowSongInfoDTO;
import org.example.songservice.dtos.SongIdGenreDTO;
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
	public ShowSongInfoDTO getSongByUUID(UUID uuid) {
        Song foundSong = new Song();
        foundSong = songRepo.findById(uuid).get();
        return mapperService.songToInfoDTO(foundSong);
	}

	@Override
	public String getSongTitle(UUID uuid) {
        return songRepo.findById(uuid).get().getTitle();
	}

	@Override
	public ShowSongDTO addSong(AddSongDTO dto) {
        Song song = new Song();
        song.setUrl(dto.getStreamUrl());
        song.setTitle(dto.getTitle());
        return mapperService.songToDTO(songRepo.save(song));
	}

	@Override
	public List<ShowSongDTO> getSongs(List<UUID> uuids) {
        System.out.println("Getting " + uuids.size() + " songs:");
        for(UUID uuid : uuids)
            System.out.println(uuid);
        List<Song> songs = songRepo.findAllById(uuids);
        return mapperService.songsToDTOList(songs);
	}

    @Override
    public SongIdGenreDTO getSongIdAndGenre(String url) {
        Song song = songRepo.findByUrl(url)
                .orElseThrow(() -> new RuntimeException("Song not found"));

        List<String> genreNames = song.getGenres().isEmpty()
                ? List.of("Unknown")
                : song.getGenres().stream().map(g -> g.getGenre()).toList();

        return new SongIdGenreDTO(song.getUuid(), genreNames);
    }
}
