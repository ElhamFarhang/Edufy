package org.example.albumservice.services.apis;

import java.util.List;
import java.util.UUID;

import org.example.albumservice.dtos.SongInfoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * SongApiClientServiceImpl
 */
@Service
public class ApiClientServiceImpl implements ApiClientService {

    @Value("${api.song}")
    private String songApi;

    @Value("${api.artist}")
    private String artistApi;

	@Override
	public SongInfoDTO getSongInfo(UUID uuid) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<SongInfoDTO> response = template.getForEntity(songApi+"/songinfo/"+uuid, SongInfoDTO.class);
        return response.getBody();
	}

    @Override
	public List<SongInfoDTO> getSongInfos(List<UUID> uuids) {
        RestTemplate template = new RestTemplate();
        HttpEntity entity = new HttpEntity<List<UUID>>(uuids);
        ResponseEntity<List<SongInfoDTO>> response = template.exchange(songApi+"/songcollection", HttpMethod.POST, entity, new ParameterizedTypeReference<List<SongInfoDTO>>() {});
        return response.getBody();
    // ResponseEntity<List<SongInfoDTO>> response = template.postForEntity(songApi+"/songcollection",uuids, List<SongInfoDTO>.class);
	}

	@Override
	public String getSongTitle(UUID uuid) {
        return getStringResponse(songApi+"/songtitle/"+uuid);
	}

	@Override
	public String getArtistName(UUID uuid) {
        return getStringResponse(artistApi+"/artistname/"+uuid);
	}

	private String getStringResponse(String url){
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response = template.getForEntity(url, String.class);
        return response.getBody();
    }
}
