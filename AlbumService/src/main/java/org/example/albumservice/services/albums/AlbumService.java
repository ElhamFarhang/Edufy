package org.example.albumservice.services.albums;

import java.util.List;

import org.example.albumservice.dtos.ShowAlbumDTO;

public interface AlbumService {
    List<ShowAlbumDTO> getAllAlbums();
}
