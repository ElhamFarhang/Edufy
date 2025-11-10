package org.example.albumservice.services.albums;

import java.util.List;

import org.example.albumservice.dtos.ShowAlbumDTO;
import org.example.albumservice.repositories.AlbumRepository;
import org.example.albumservice.services.mappers.DTOMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AlbumServiceImpl
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepo;
    private final DTOMapperService mapperService;

    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepo, DTOMapperService mapperService) {
        this.albumRepo = albumRepo;
        this.mapperService = mapperService;
    }

	@Override
	public List<ShowAlbumDTO> getAllAlbums() {
        return mapperService.toShowAlbumListDTO(albumRepo.findAll());
	}
}
