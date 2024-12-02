package com.xworkz.musicapp.songs;

import com.xworkz.musicapp.constants.GenreType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Songs {
    private int id;
    private String title;
    private String artist;
    private GenreType genre;
    private int releaseYear;
    private String duration;
    private boolean isAvailable;
}
