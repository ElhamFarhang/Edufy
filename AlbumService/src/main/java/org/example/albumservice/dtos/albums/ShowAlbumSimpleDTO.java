package org.example.albumservice.dtos.albums;

import java.util.List;

public class ShowAlbumSimpleDTO extends ShowAlbumDTO {
    private List<?> songs;

    public ShowAlbumSimpleDTO() {
    }

	public List<?> getSongs() {
		return songs;
	}

	public void setSongs(List<?> songs) {
		this.songs = songs;
	}
}
