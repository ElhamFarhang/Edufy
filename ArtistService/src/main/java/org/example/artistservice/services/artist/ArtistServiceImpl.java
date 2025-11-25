package org.example.artistservice.services.artist;

import java.util.List;
import java.util.UUID;

import org.example.artistservice.dtos.artist.ArtistAlbumMinimalDTO;
import org.example.artistservice.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepo;

    @Autowired
    public ArtistServiceImpl(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }

	@Override
	public String getArtistNameByUUID(UUID uuid) {
        return artistRepo.findById(uuid).get().getName();
	}

	@Override
	public List<ArtistAlbumMinimalDTO> getAllArtists() {
        return null;
	}
}
