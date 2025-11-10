package org.example.albumservice.repositories;

import java.util.UUID;

import org.example.albumservice.entites.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, UUID> {
}
