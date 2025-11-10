package org.example.albumservice.services.apis;

import java.util.UUID;

import org.example.albumservice.dtos.SongInfoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * SongApiClientServiceImpl
 */
@Service
public class SongApiClientServiceImpl implements SongApiClientService {

    @Value("${song-api}")
    private String api;

	@Override
	public SongInfoDTO getSongInfo(UUID uuid) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<SongInfoDTO> response = template.getForEntity(api+"/songbyid/"+uuid, SongInfoDTO.class);
        return response.getBody();
	}
}
