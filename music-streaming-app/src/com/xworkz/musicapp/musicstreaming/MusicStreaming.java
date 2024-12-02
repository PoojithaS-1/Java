package com.xworkz.musicapp.musicstreaming;


import com.xworkz.musicapp.constants.GenreType;
import com.xworkz.musicapp.songs.Songs;

import java.util.Arrays;

public interface MusicStreaming {

    public boolean addSongs(Songs songs) ;

    public void getSongsInfo();

    public Songs getTitleById(int id);


    public Songs getArtistByTitle(String title);

    public Songs getGenreByTitle(String title);

    public Songs getReleaseYearByArtist(String artist);


    public Songs getTitleByGenre(GenreType genre);

    public Songs getIsAvailableBygenre(GenreType genre);

    public boolean updateTitleById(int id,String updatedTitle);

    public boolean updateReleaseYearByTitle(String title,int updatedReleaseYear);

    public boolean updateIsAvailableByTitle(String title,boolean updatedIsAvailable);

    public boolean deleteSongsById(int id);


}
