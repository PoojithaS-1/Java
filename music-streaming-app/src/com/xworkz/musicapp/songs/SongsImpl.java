package com.xworkz.musicapp.songs;

import com.xworkz.musicapp.constants.GenreType;
import com.xworkz.musicapp.musicstreaming.MusicStreaming;

import java.util.Arrays;

public class SongsImpl implements MusicStreaming {
    Songs songs[]=new Songs[6];
    int index;
@Override
    public boolean addSongs(Songs songs) {
        if (index < this.songs.length) {
            if (songs.getId() > 0 && songs.getTitle() != null && songs.getGenre() != null) {
                this.songs[index++] = songs;
                System.out.println("Song Added Successfully");
                return true;
            } else {
                System.out.println("Invalid details");
                return false;
            }
        } else {
            System.out.println("ArrayIndexOutOfBoundsException: Songs array is full");
            return false;
        }
    }
    @Override
    public void getSongsInfo(){
        System.out.println("Songs Info: ");
        for (Songs songs1:songs){
            if (songs1 != null){
                System.out.println("SongId: "+songs1.getId());
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("SongArtist: "+songs1.getArtist());
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("Song ReleaseYear: "+songs1.getReleaseYear());
                System.out.println("Song Duration: "+songs1.getDuration());
                System.out.println("Is song available: "+songs1.isAvailable());
                System.out.println("_________________________________________________");
            }else {
                System.out.println("Not Available");
            }
        }
    }
    @Override
    public Songs getTitleById(int id){
        Songs isTitleFoundById=null;
        System.out.println("GetTitle By Id");
        for (Songs songs1:songs){
            if (songs1.getId()==id){
                isTitleFoundById=songs1;
                System.out.println("SongId: "+songs1.getId());
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("________________________________________________");
            }
        }
        if (isTitleFoundById == null){
            System.out.println("Title not found");
        }
        return isTitleFoundById;
    }
    @Override
    public Songs getArtistByTitle(String title){
        Songs isArtistFoundByTitle=null;
        System.out.println("GetArtist By Title");
        for (Songs songs1:songs){
            if (songs1.getTitle()==title){
                isArtistFoundByTitle=songs1;
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("SongArtist: "+songs1.getArtist());
                System.out.println("__________________________________________");
            }
        }
        if (isArtistFoundByTitle==null){
            System.out.println("Artist not found");
        }
        return isArtistFoundByTitle;
    }
    @Override
    public Songs getGenreByTitle(String title){
        Songs isGenreFoundByTitle=null;
        System.out.println("GetGenre By Title");
        for (Songs songs1:songs){
            if (songs1.getTitle()==title){
                isGenreFoundByTitle=songs1;
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("______________________________________________");
            }
        }
        if (isGenreFoundByTitle==null){
            System.out.println("Genre not found");
        }
        return isGenreFoundByTitle;
    }
    @Override
    public Songs getReleaseYearByArtist(String artist){
        Songs isReleaseYearByArtist=null;
        System.out.println("GetReleaseYear By Artist");
        for (Songs songs1:songs){
            if (songs1.getArtist()==artist){
                isReleaseYearByArtist=songs1;
                System.out.println("Artist: "+songs1.getArtist());
                System.out.println("Song ReleaseYear: "+songs1.getReleaseYear());
                System.out.println("_______________________________________________");
            }
        }
        if (isReleaseYearByArtist==null){
            System.out.println("ReleaseYear not found");
        }
        return isReleaseYearByArtist;
    }
    @Override
    public Songs getTitleByGenre(GenreType genre){
        Songs isTitleByGenre=null;
        System.out.println("GetTitle By Genre");
        for (Songs songs1:songs){
            if (songs1.getGenre()== genre){
                isTitleByGenre=songs1;
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("Title: "+songs1.getTitle());
                System.out.println("_________________________________________________");
            }
        }
        if (isTitleByGenre==null){
            System.out.println("Title not found");
        }
        return isTitleByGenre;
    }
    @Override
    public Songs getIsAvailableBygenre(GenreType genre){
        Songs isAvailableFoundBygenre=null;
        System.out.println("GetIsAvailable By genre");
        for (Songs songs1:songs){
            if (songs1.getGenre()==genre){
                isAvailableFoundBygenre=songs1;
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("isAvailable: "+songs1.isAvailable());
                System.out.println("_______________________________________________");
            }
        }
        if (isAvailableFoundBygenre==null){
            System.out.println("isAvailable not found");
        }
        return isAvailableFoundBygenre;
    }
    @Override
    public boolean updateTitleById(int id,String updatedTitle){
        boolean isTitleUpdatedById=false;
        System.out.println("UpdateTitle By Id");
        for (Songs songs1:songs){
            if (songs1.getId()==id){
                songs1.setTitle(updatedTitle);
                System.out.println("SongId: "+songs1.getId());
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("SongArtist: "+songs1.getArtist());
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("Song ReleaseYear: "+songs1.getReleaseYear());
                System.out.println("Song Duration: "+songs1.getDuration());
                System.out.println("Is song available: "+songs1.isAvailable());
                System.out.println("_________________________________________________");
                isTitleUpdatedById=true;

            }
        }
        if (isTitleUpdatedById==false){
            System.out.println("Title not Updated.Id not Found");
        }
        return isTitleUpdatedById;
    }
    @Override
    public boolean updateReleaseYearByTitle(String title,int updatedReleaseYear){
        boolean isRealeaseYearUpdatedByTitle=false;
        System.out.println("UpdateReleaseYear By Title");
        for (Songs songs1:songs){
            if (songs1.getTitle()==title){
                songs1.setReleaseYear(updatedReleaseYear);
                System.out.println("SongId: "+songs1.getId());
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("SongArtist: "+songs1.getArtist());
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("Song ReleaseYear: "+songs1.getReleaseYear());
                System.out.println("Song Duration: "+songs1.getDuration());
                System.out.println("Is song available: "+songs1.isAvailable());
                System.out.println("_________________________________________________");
                isRealeaseYearUpdatedByTitle=true;
            }
        }
        if(isRealeaseYearUpdatedByTitle==false){
            System.out.println("RealeaseYear not updated by Title");
        }
        return isRealeaseYearUpdatedByTitle;
    }
    @Override
    public boolean updateIsAvailableByTitle(String title,boolean updatedIsAvailable){
        boolean isAvailableUpdatedByTitle=false;
        System.out.println("UpdateIsAvailable By Title");
        for (Songs songs1:songs){
            if (songs1.getTitle()==title){
                songs1.setAvailable(updatedIsAvailable);
                System.out.println("SongId: "+songs1.getId());
                System.out.println("SongTitle: "+songs1.getTitle());
                System.out.println("SongArtist: "+songs1.getArtist());
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("Song ReleaseYear: "+songs1.getReleaseYear());
                System.out.println("Song Duration: "+songs1.getDuration());
                System.out.println("Is song available: "+songs1.isAvailable());
                System.out.println("_________________________________________________");
                isAvailableUpdatedByTitle=true;
            }
        }
        if (isAvailableUpdatedByTitle==false){
            System.out.println("IsAvailable not found by Title");
        }
        return isAvailableUpdatedByTitle;
    }
    @Override
    public boolean deleteSongsById(int id){
        boolean isSongDeleted=false;
        int i=0;
        System.out.println("DeleteSongs By Id");
        for (int start=0;start<this.songs.length;start++){
            Songs songs1=songs[start];
            if (songs1.getId() != id){
                songs[i++]=songs[start];
            }else {
                isSongDeleted=true;
            }
        }
        int size=i;
        songs= Arrays.copyOf(songs,i);
        return isSongDeleted;
    }
}
