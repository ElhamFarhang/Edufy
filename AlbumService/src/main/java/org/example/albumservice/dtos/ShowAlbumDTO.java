package org.example.albumservice.dtos;

import java.util.List;

public class ShowAlbumDTO {
    private String title;
    private String release;
    private List<SongInfoDTO> songs;

    public ShowAlbumDTO() {
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public List<SongInfoDTO> getSongs() {
		return songs;
	}

	public void setSongs(List<SongInfoDTO> songs) {
		this.songs = songs;
	}
}
