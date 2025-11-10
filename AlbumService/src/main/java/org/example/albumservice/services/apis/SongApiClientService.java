package org.example.albumservice.services.apis;

import java.util.UUID;

import org.example.albumservice.dtos.SongInfoDTO;

/**
 * SongApiClientService
 */
public interface SongApiClientService {
    SongInfoDTO getSongInfo(UUID uuid);
}
