package com.training.springcore.model.mockito;

import java.util.List;

public class Album {

    private String id;
    private String name;
    private List<String> Artist;

    public Album(String id, String name, List<String> artist) {
        this.id = id;
        this.name = name;
        Artist = artist;
    }
}
