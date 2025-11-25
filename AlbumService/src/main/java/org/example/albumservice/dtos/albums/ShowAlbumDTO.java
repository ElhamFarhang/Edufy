package org.example.albumservice.dtos.albums;

public class ShowAlbumDTO {
    private String title;
    private String release;

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
}
