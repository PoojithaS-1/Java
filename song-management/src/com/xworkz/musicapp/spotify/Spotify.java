package com.xworkz.musicapp.spotify;

import com.xworkz.musicapp.song.Song;

public class Spotify {
    Song song;
    public boolean addSong(Song song){
        boolean isSongAdded=false;
        if (song !=null){
            if (song.getSongId()>0 && song.getTitle()!=null){
                this.song=song;
                isSongAdded=true;
            }else {
                System.out.println("Song not added");
            }
        }
        return isSongAdded;
    }
    public void getSongInfo(){
        System.out.println("SongId: "+song.getSongId());
        System.out.println("SongTitle: "+song.getTitle());
        System.out.println("SongArtist: "+song.getArtist());
        System.out.println("Genre is: "+song.getGenre());
        System.out.println("Song ReleaseYear: "+song.getReleaseYear());
    }
}
