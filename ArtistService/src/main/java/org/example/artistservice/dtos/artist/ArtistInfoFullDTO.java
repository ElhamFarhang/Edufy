package org.example.artistservice.dtos.artist;

import java.util.List;

import org.example.artistservice.dtos.song.ShowSongInfo;

public class ArtistInfoFullDTO extends ArtistAlbumMinimalDTO {
    private List<ShowSongInfo> songs;

    public ArtistInfoFullDTO() {
    }

    public List<ShowSongInfo> getSongs() {
        return songs;
    }

    public void setSongs(List<ShowSongInfo> songs) {
        this.songs = songs;
    }
}
