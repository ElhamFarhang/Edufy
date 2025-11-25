package org.example.artistservice.repositories;

import java.util.UUID;

import org.example.artistservice.entites.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, UUID> {
}
