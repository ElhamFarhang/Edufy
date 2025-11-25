package org.example.artistservice.dtos.song;

import java.util.List;

/**
 * ShowSongInfo
 */
public class ShowSongInfo {

    private String title;
    private List<String> genres;

    public ShowSongInfo() {
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
