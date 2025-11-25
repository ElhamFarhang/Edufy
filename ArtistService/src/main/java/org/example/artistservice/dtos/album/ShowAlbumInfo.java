package org.example.artistservice.dtos.album;

/**
 * ShowAlbumInfo
 */
public class ShowAlbumInfo {

    private String title;
    private Long release;

    public ShowAlbumInfo() {
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getRelease() {
		return release;
	}

	public void setRelease(Long release) {
		this.release = release;
	}
}
