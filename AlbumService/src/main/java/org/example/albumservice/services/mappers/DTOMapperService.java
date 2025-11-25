package org.example.albumservice.services.mappers;

import java.util.List;

import org.example.albumservice.dtos.albums.ShowAlbumDTO;
import org.example.albumservice.dtos.albums.ShowAlbumFullDTO;
import org.example.albumservice.dtos.albums.ShowAlbumSimpleDTO;
import org.example.albumservice.entites.Album;

/**
 * DTOMapperService
 */
public interface DTOMapperService {

    ShowAlbumDTO toShowAlbumDTO(Album album);
    ShowAlbumFullDTO toShowAlbumFullDTO(Album album);
    ShowAlbumSimpleDTO toShowAlbumSimpleDTO(Album album);
    List<ShowAlbumDTO> toShowAlbumListDTO(List<Album> albums, String details);
    List<ShowAlbumFullDTO> toShowAlbumFullListDTO(List<Album> albums);
}
