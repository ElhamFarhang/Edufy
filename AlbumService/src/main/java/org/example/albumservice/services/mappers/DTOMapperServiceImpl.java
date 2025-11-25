package org.example.albumservice.services.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.example.albumservice.dtos.albums.*;
import org.example.albumservice.dtos.ErrorDTO;
import org.example.albumservice.dtos.SongInfoDTO;
import org.example.albumservice.entites.Album;
import org.example.albumservice.services.apis.ApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DTOMapperServiceImpl
 */
@Service
public class DTOMapperServiceImpl implements DTOMapperService {

    private final ApiClientService apiClient;

    @Autowired
    public DTOMapperServiceImpl(ApiClientService apiClient) {
        this.apiClient = apiClient;
    }

	@Override
	public ShowAlbumDTO toShowAlbumDTO(Album album) {
        ShowAlbumDTO dto = new ShowAlbumDTO();

        dto.setTitle(album.getTitle());
        dto.setRelease(""+album.getRelease());

        return dto;
	}

	@Override
	public ShowAlbumSimpleDTO toShowAlbumSimpleDTO(Album album) {
        ShowAlbumSimpleDTO dto = new ShowAlbumSimpleDTO();

        dto.setTitle(album.getTitle());
        dto.setRelease(""+album.getRelease());

        List<Object> songs = new ArrayList<>();
        for(UUID song : album.getSongs()){
            songs.add(apiClient.getSongTitle(song));
        }
        dto.setSongs(songs);

        return dto;
	}

	@Override
	public ShowAlbumFullDTO toShowAlbumFullDTO(Album album) {
        ShowAlbumFullDTO dto = new ShowAlbumFullDTO();

        dto.setTitle(album.getTitle());
        dto.setRelease(""+album.getRelease());

        List<String> artists = new ArrayList<>();
        for(UUID artist : album.getArtists()){
            artists.add(apiClient.getArtistName(artist));
        }
        dto.setArtists(artists);

        long start = System.currentTimeMillis();
        List<Object> songs = new ArrayList<>();
        for(UUID song : album.getSongs()){
            SongInfoDTO songInfo = new SongInfoDTO();
            songInfo = apiClient.getSongInfo(song);
            songs.add(songInfo);
        }
        long stop = System.currentTimeMillis();
        long individual = stop - start;
        songs.clear();

        start = System.currentTimeMillis();
        dto.setSongs(apiClient.getSongInfos(album.getSongs()));
        stop = System.currentTimeMillis();
        long batch = stop - start;
        System.out.println(album.getTitle());
        System.out.println("Individual: " + individual);
        System.out.println("Batch: " + batch);

        return dto;
	}

	@Override
	public List<ShowAlbumFullDTO> toShowAlbumFullListDTO(List<Album> albums) {
        List<ShowAlbumFullDTO> dtos = new ArrayList<>();

        for(Album album : albums){
            dtos.add(toShowAlbumFullDTO(album));
        }

        return dtos;
	}

	@Override
	public List<ShowAlbumDTO> toShowAlbumListDTO(List<Album> albums, String details) {
        List<ShowAlbumDTO> dtos = new ArrayList<>();
        switch (details) {
            case "full":
                for(Album album : albums){
                    dtos.add(toShowAlbumFullDTO(album));
                }
            break;
            case "simple":
                for(Album album : albums){
                    dtos.add(toShowAlbumSimpleDTO(album));
                }
            break;
            default:
                for(Album album : albums){
                    dtos.add(toShowAlbumDTO(album));
                }
            break;
        }
        return dtos;
	}

    private List<String> getArtists(List<UUID> uuids){
        List<String> artists = new ArrayList<>();
        for(UUID artist : uuids){
            artists.add(apiClient.getArtistName(artist));
        }
        return artists;
    }
}
