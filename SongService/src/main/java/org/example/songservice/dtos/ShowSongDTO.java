package org.example.songservice.dtos;

import java.util.List;
import java.util.UUID;

public class ShowSongDTO {
    // private UUID uuid;
    private String title;
    private String streamUrl;
    private List<String> genres;

    public ShowSongDTO() {
    }

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	// public UUID getUuid() {
	// 	return uuid;
	// }
	//
	// public void setUuid(UUID uuid) {
	// 	this.uuid = uuid;
	// }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStreamUrl() {
		return streamUrl;
	}

	public void setStreamUrl(String streamUrl) {
		this.streamUrl = streamUrl;
	}
}
