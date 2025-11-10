package org.example.albumservice.services.mappers;

import java.util.List;

import org.example.albumservice.dtos.ShowAlbumDTO;
import org.example.albumservice.entites.Album;

/**
 * DTOMapperService
 */
public interface DTOMapperService {

    ShowAlbumDTO toShowAlbumDTO(Album album);
    List<ShowAlbumDTO> toShowAlbumListDTO(List<Album> albums);
}
