package com.xworkz.musicapp;

import com.xworkz.musicapp.constants.GenreType;
import com.xworkz.musicapp.musicstreaming.MusicStreaming;
import com.xworkz.musicapp.songs.Songs;

public class SongRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Songs song1 =new Songs();
        song1.setId(1);
        song1.setTitle("Tum Hi Ho");
        song1.setArtist("Arijith Singh");
        song1.setGenre(GenreType.ROMANTIC);
        song1.setReleaseYear(2013);
        song1.setDuration("4:22");
        song1.setAvailable(true);

        MusicStreaming musicStreaming=new MusicStreaming();
        musicStreaming.addSongs(song1);

        Songs song2 =new Songs();
        song2.setId(2);
        song2.setTitle("Kal Ho Naa Ho");
        song2.setArtist("Sonu Nigam");
        song2.setGenre(GenreType.SAD);
        song2.setReleaseYear(2003);
        song2.setDuration("5:20");
        song2.setAvailable(true);

        musicStreaming.addSongs(song2);

        Songs song3 =new Songs();
        song3.setId(3);
        song3.setTitle("Ae Dil Hai Mushkil");
        song3.setArtist("Arijith Singh");
        song3.setGenre(GenreType.ROMANTIC);
        song3.setReleaseYear(2016);
        song3.setDuration("4:49");
        song3.setAvailable(true);

        musicStreaming.addSongs(song3);

        Songs song4 =new Songs();
        song4.setId(4);
        song4.setTitle("Zindagi Na Milegi Dobara");
        song4.setArtist("Shankar-Ehsaan-Loy");
        song4.setGenre(GenreType.MOTIVATIONAL);
        song4.setReleaseYear(2011);
        song4.setDuration("3:35");
        song4.setAvailable(false);

        musicStreaming.addSongs(song4);

        Songs song5 =new Songs();
        song5.setId(5);
        song5.setTitle("Kabhi Khushi Kabhie Gham");
        song5.setArtist("Sonu Nigam");
        song5.setGenre(GenreType.ROMANTIC);
        song5.setReleaseYear(2001);
        song5.setDuration("5:03");
        song5.setAvailable(true);

        musicStreaming.addSongs(song5);

        Songs song6 =new Songs();
        song6.setId(6);
        song6.setTitle("Kesari");
        song6.setArtist("B Praak");
        song6.setGenre(GenreType.PATRIOTIC);
        song6.setReleaseYear(2019);
        song6.setDuration("5:36");
        song6.setAvailable(true);

        musicStreaming.addSongs(song6);

        Songs song7 =new Songs();
        song7.setId(7);
        song7.setTitle("RRR");
        song7.setArtist("Vishal Mishra, Rahul Sipligunj");
        song7.setGenre(GenreType.DANCE);
        song7.setReleaseYear(2022);
        song7.setDuration("3:42");
        song7.setAvailable(true);

        musicStreaming.addSongs(song7);

        musicStreaming.getSongsInfo();

        musicStreaming.getTitleById(3);

        musicStreaming.getArtistByTitle("Kabhi Khushi Kabhie Gham");

        musicStreaming.getGenreByTitle("Kal Ho Naa Ho");

        musicStreaming.getReleaseYearByArtist("Sonu Nigam");

        musicStreaming.getTitleByGenre(GenreType.ROMANTIC);

        musicStreaming.getIsAvailableBygenre(GenreType.PATRIOTIC);

        musicStreaming.updateTitleById(1,"Yenagali");

        musicStreaming.updateReleaseYearByTitle("Yenagali",2012);

        musicStreaming.updateIsAvailableByTitle("Zindagi Na Milegi Dobara",true);

        musicStreaming.deleteSongsById(6);

        musicStreaming.getSongsInfo();

        System.out.println("Main Ended");
    }
}
