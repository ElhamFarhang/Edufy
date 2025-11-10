package org.example.albumservice.services.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.example.albumservice.dtos.ShowAlbumDTO;
import org.example.albumservice.dtos.SongInfoDTO;
import org.example.albumservice.entites.Album;
import org.example.albumservice.services.apis.SongApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DTOMapperServiceImpl
 */
@Service
public class DTOMapperServiceImpl implements DTOMapperService {

    private final SongApiClientService songApi;

    @Autowired
    public DTOMapperServiceImpl(SongApiClientService songApi) {
        this.songApi = songApi;
    }

	@Override
	public ShowAlbumDTO toShowAlbumDTO(Album album) {
        ShowAlbumDTO dto = new ShowAlbumDTO();

        dto.setTitle(album.getTitle());
        // dto.setUuid(album.getUuid());
        dto.setRelease(""+album.getRelease());

        List<SongInfoDTO> songs = new ArrayList<>();
        for(UUID song : album.getSongs()){
            SongInfoDTO songInfo = songApi.getSongInfo(song);
            songs.add(songInfo);
            // System.out.println("Song: " + songInfo.getTitle());
        }
        dto.setSongs(songs);

        return dto;
	}

	@Override
	public List<ShowAlbumDTO> toShowAlbumListDTO(List<Album> albums) {
        List<ShowAlbumDTO> dtos = new ArrayList<>();

        for(Album album : albums){
            dtos.add(toShowAlbumDTO(album));
        }

        return dtos;
	}
}
