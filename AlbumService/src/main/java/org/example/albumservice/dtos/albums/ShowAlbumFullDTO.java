package org.example.albumservice.dtos.albums;

import java.util.List;

public class ShowAlbumFullDTO extends ShowAlbumSimpleDTO {
    private List<String> artists;

    public ShowAlbumFullDTO() {
    }

	public List<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = artists;
	}
}
