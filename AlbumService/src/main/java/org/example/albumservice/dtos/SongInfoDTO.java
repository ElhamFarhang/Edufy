package org.example.albumservice.dtos;

import java.util.List;

public class SongInfoDTO {
    private String title;
    private List<String> genres;

    public SongInfoDTO() {
    }

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
