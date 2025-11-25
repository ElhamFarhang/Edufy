package org.example.artistservice.services.mappers;

import java.util.ArrayList;
import java.util.List;

import org.example.artistservice.dtos.artist.ArtistAlbumMinimalDTO;
import org.example.artistservice.entites.Artist;
import org.springframework.stereotype.Service;

@Service
public class DTOMapperServiceImpl implements DTOMapperService {

	@Override
	public ArtistAlbumMinimalDTO toArtistInfo(Artist artist) {
        ArtistAlbumMinimalDTO dto = new ArtistAlbumMinimalDTO();

        dto.setName(artist.getName());

        return dto;
	}

	@Override
	public List<ArtistAlbumMinimalDTO> toShowArtistInfoList(List<Artist> artists) {
        List<ArtistAlbumMinimalDTO> dtos = new ArrayList<>();

        for(Artist artist : artists){
            dtos.add(toArtistInfo(artist));
        }

        return dtos;
	}
}
