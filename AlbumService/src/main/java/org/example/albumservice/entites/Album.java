package org.example.albumservice.entites;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", columnDefinition = "char(36)")
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID uuid;

    @ElementCollection
    @JoinTable(name = "album_artists", joinColumns = @JoinColumn(name = "uuid", columnDefinition = "char(36)"))
    @Column(name = "artist_uuid", columnDefinition = "char(36)")
    @JdbcTypeCode(SqlTypes.CHAR)
    private List<UUID> artists;

    @Column(name = "album_title")
    private String title;

    @Column(name = "release_date")
    private Long release;

    @ElementCollection
    @JoinTable(name = "album_songs", joinColumns = @JoinColumn(name = "uuid", columnDefinition = "char(36)"))
    @Column(name = "song_uuid", columnDefinition = "char(36)")
    @JdbcTypeCode(SqlTypes.CHAR)
    private List<UUID> songs;

    public Album() {
    }

	public List<UUID> getArtists() {
		return artists;
	}

	public void setArtists(List<UUID> artists) {
		this.artists = artists;
	}

	public Long getRelease() {
		return release;
	}

	public void setRelease(Long release) {
		this.release = release;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<UUID> getSongs() {
		return songs;
	}

	public void setSongs(List<UUID> songs) {
		this.songs = songs;
	}
}
