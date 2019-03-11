package com.training.springcore.service.mockito;

import com.training.springcore.model.mockito.Album;

import java.util.List;

public interface MusicFinder {
    List<Album> findByArtist(String artist);
    List<Album> findByName(String name);
}
