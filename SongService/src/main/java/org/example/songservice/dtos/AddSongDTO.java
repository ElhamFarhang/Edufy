package org.example.songservice.dtos;

public class AddSongDTO {
    private String title;
    private String streamUrl;

    public AddSongDTO() {
    }

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
