package org.example.songservice.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.example.songservice.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, UUID> {
    Optional<List<Song>> findSongsByUuid(UUID uuid);

    // Optional<Song> findByUuid(UUID uuid);
     Optional<Song> findByUrl(String url);
}
