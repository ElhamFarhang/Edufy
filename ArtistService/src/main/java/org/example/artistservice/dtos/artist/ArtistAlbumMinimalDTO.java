package org.example.artistservice.dtos.artist;

import java.util.List;

import org.example.artistservice.dtos.album.ShowAlbumInfo;

/**
 * ArtistAlbumMinimal
 */
public class ArtistAlbumMinimalDTO extends ShowArtist {
    private String name;
    private List<ShowAlbumInfo> albums;

    public ArtistAlbumMinimalDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShowAlbumInfo> getAlbums() {
        return albums;
    }

    public void setAlbums(List<ShowAlbumInfo> albums) {
        this.albums = albums;
    }
}
