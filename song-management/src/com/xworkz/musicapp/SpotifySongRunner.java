package com.xworkz.musicapp;

import com.xworkz.musicapp.song.Song;
import com.xworkz.musicapp.spotify.Spotify;

public class SpotifySongRunner {
    public static void main(String[] args){
        Spotify spotify=new Spotify();
        Song song=new Song();
        song.setSongId(123);
        song.setTitle("Muddu Raakshasi.");
        song.setArtist("Chethan Gowda.");
        song.setGenre("Romantic,Melody.");
        song.setReleaseYear(2024);

        spotify.addSong(song);
        spotify.getSongInfo();
    }
}
