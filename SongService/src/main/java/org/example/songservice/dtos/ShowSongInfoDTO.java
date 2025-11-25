package org.example.songservice.dtos;

import java.util.List;

/**
 * ShowSongInfoDTO
 */
public class ShowSongInfoDTO {

    private String title;
    private List<String> genres;

    public ShowSongInfoDTO() {
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
}
