-- ALTER TABLE songs ALTER COLUMN uuid SET DEFAULT gen_random_uuid();
-- Absolution, Muse
INSERT INTO songs (uuid, title, stream_url) VALUES ("ed6288bf-84d3-4bee-b753-4e7ef227644f", "Time is Running Out", "https://youtu.be/8eB2d_saQo4")
INSERT INTO songs (uuid, title, stream_url) VALUES ("65790255-afc6-49ca-964e-37bc10a285b3", "Hysteria", "https://youtu.be/HqAMbWjs5jY")
-- Americana, Offspring
INSERT INTO songs (uuid, title, stream_url) VALUES ("71c74694-e496-48e2-8b4a-9409c05eaaae", "The Kids Aren't Alright", "https://youtu.be/-uQi0vJK9lk")
INSERT INTO songs (uuid, title, stream_url) VALUES ("d881be1b-8b5e-4748-b9b6-bedb393416a4", "Pretty Fly (For A White Guy)", "https://youtu.be/BepGmpLT9HA")
INSERT INTO songs (uuid, title, stream_url) VALUES ("5fa9d334-0278-4066-9b99-c64e4be7db83", "Why Don't You Get A Job", "https://youtu.be/mQYJYY4VkWA")


INSERT INTO genres (genre) VALUES ("Rock")
INSERT INTO genres (genre) VALUES ("Pop")
INSERT INTO genres (genre) VALUES ("Metal")
INSERT INTO genres (genre) VALUES ("Punk")
INSERT INTO genres (genre) VALUES ("Alternative")
-- TiRO
INSERT INTO song_genres (uuid, genre_id) VALUES ("ed6288bf-84d3-4bee-b753-4e7ef227644f", 1)
INSERT INTO song_genres (uuid, genre_id) VALUES ("ed6288bf-84d3-4bee-b753-4e7ef227644f", 5)
-- Hysteria
INSERT INTO song_genres (uuid, genre_id) VALUES ("65790255-afc6-49ca-964e-37bc10a285b3", 1)
INSERT INTO song_genres (uuid, genre_id) VALUES ("65790255-afc6-49ca-964e-37bc10a285b3", 4)
-- TKAA
INSERT INTO song_genres (uuid, genre_id) VALUES ("71c74694-e496-48e2-8b4a-9409c05eaaae", 1)
INSERT INTO song_genres (uuid, genre_id) VALUES ("71c74694-e496-48e2-8b4a-9409c05eaaae", 4)
INSERT INTO song_genres (uuid, genre_id) VALUES ("71c74694-e496-48e2-8b4a-9409c05eaaae", 5)
-- PF
INSERT INTO song_genres (uuid, genre_id) VALUES ("d881be1b-8b5e-4748-b9b6-bedb393416a4", 1)
INSERT INTO song_genres (uuid, genre_id) VALUES ("d881be1b-8b5e-4748-b9b6-bedb393416a4", 4)
INSERT INTO song_genres (uuid, genre_id) VALUES ("d881be1b-8b5e-4748-b9b6-bedb393416a4", 5)
-- WDYGAJ
INSERT INTO song_genres (uuid, genre_id) VALUES ("5fa9d334-0278-4066-9b99-c64e4be7db83", 1)
INSERT INTO song_genres (uuid, genre_id) VALUES ("5fa9d334-0278-4066-9b99-c64e4be7db83", 4)
--

