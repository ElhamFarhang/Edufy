package org.example.artistservice.services.artist;

import java.util.List;
import java.util.UUID;

import org.example.artistservice.dtos.artist.ArtistAlbumMinimalDTO;

public interface ArtistService {
    List<ArtistAlbumMinimalDTO> getAllArtists();
    String getArtistNameByUUID(UUID uuid);
}
