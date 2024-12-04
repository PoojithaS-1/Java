package com.xworkz.musicapp.song;

public class Song {
    private String title;
    private String artist;
    private int songId;
    private String genre;
    private int releaseYear;

    public Song(){
        System.out.println("Song constructor invoked");
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getSongId() {
        return songId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Song-title= " + this.title +","+
                "artist= " + this.artist +","+
                "songId= " + this.songId +","+
                "genre= " + this.genre + ","+
                "releaseYear=" + this.releaseYear ;
    }
}
