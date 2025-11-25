package org.example.artistservice.services.mappers;

import java.util.List;

import org.example.artistservice.dtos.artist.ArtistAlbumMinimalDTO;
import org.example.artistservice.entites.Artist;

public interface DTOMapperService {
    ArtistAlbumMinimalDTO toArtistInfo(Artist artist);
    List<ArtistAlbumMinimalDTO> toShowArtistInfoList(List<Artist> artists);
}
