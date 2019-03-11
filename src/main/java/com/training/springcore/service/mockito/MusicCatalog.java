package com.training.springcore.service.mockito;

import com.training.springcore.model.mockito.Album;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MusicCatalog {

    private MusicFinder musicFinder;

    public MusicCatalog(MusicFinder musicFinder) {
        this.musicFinder = musicFinder;
    }

    public List<Album> searchAlbum(String name, String artist){
        if(artist == null || name == null){
            return Collections.emptyList();
        }
        Stream<Album> albumByArtist = musicFinder.findByArtist(artist).stream();
        Stream<Album> albumByName = musicFinder.findByName(name).stream();

        return Stream.concat(albumByArtist, albumByName).distinct().collect(Collectors.toList());
    }
}
