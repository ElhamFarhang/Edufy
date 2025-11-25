INSERT INTO albums (uuid, album_title, release_date) VALUES ("41ffe47d-1cd2-40ed-a7f2-60e6904fe677", "Absolution", 2003)
INSERT INTO albums (uuid, album_title, release_date) VALUES ("2c104498-71a3-4617-9f66-a2f28daec37a", "Americana", 1998)

-- Absolution - Muse
INSERT INTO album_artists (uuid, artist_uuid) VALUES("41ffe47d-1cd2-40ed-a7f2-60e6904fe677","db0c10fe-ccfa-41f3-8abb-4a7ef03d7920")

INSERT INTO album_songs (uuid, song_uuid) VALUES("41ffe47d-1cd2-40ed-a7f2-60e6904fe677", "ed6288bf-84d3-4bee-b753-4e7ef227644f")
INSERT INTO album_songs (uuid, song_uuid) VALUES("41ffe47d-1cd2-40ed-a7f2-60e6904fe677", "65790255-afc6-49ca-964e-37bc10a285b3")

-- Americana - The Offspring
INSERT INTO album_artists (uuid, artist_uuid) VALUES("2c104498-71a3-4617-9f66-a2f28daec37a","f08962e6-29c0-4b87-b1a1-16640e2cb3ca")

INSERT INTO album_songs (uuid, song_uuid) VALUES("2c104498-71a3-4617-9f66-a2f28daec37a", "71c74694-e496-48e2-8b4a-9409c05eaaae")
INSERT INTO album_songs (uuid, song_uuid) VALUES("2c104498-71a3-4617-9f66-a2f28daec37a", "d881be1b-8b5e-4748-b9b6-bedb393416a4")
INSERT INTO album_songs (uuid, song_uuid) VALUES("2c104498-71a3-4617-9f66-a2f28daec37a", "5fa9d334-0278-4066-9b99-c64e4be7db83")

-- INSERT INTO album_songs (uuid, song_uuid) VALUES(1, "")
-- INSERT INTO album_songs (uuid, song_uuid) VALUES(1, "")
-- INSERT INTO album_songs (uuid, song_uuid) VALUES(1, "")
