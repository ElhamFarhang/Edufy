package org.example.albumservice.services.albums;

import java.util.List;

import org.example.albumservice.dtos.albums.*;

public interface AlbumService {
    List<?> getAllAlbums(String details);
}
