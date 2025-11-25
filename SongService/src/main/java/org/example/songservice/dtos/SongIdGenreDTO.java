package org.example.songservice.dtos;

import java.util.List;
import java.util.UUID;

public class SongIdGenreDTO {
    private UUID mediaId;
    private List<String> genres;

    public SongIdGenreDTO(UUID mediaId, List<String> genres) {
        this.genres = genres;
        this.mediaId = mediaId;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public UUID getMediaId() {
        return mediaId;
    }

    public void setMediaId(UUID mediaId) {
        this.mediaId = mediaId;
    }

}
