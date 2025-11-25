package org.example.albumservice.services.apis;

import java.util.List;
import java.util.UUID;

import org.example.albumservice.dtos.SongInfoDTO;

/**
 * SongApiClientService
 */
public interface ApiClientService {
    SongInfoDTO getSongInfo(UUID uuid);
    List<SongInfoDTO> getSongInfos(List<UUID> uuid);
    String getSongTitle(UUID uuid);
    String getArtistName(UUID uuid);
}
