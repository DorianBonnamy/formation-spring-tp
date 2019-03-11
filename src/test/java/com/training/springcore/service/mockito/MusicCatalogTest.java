package com.training.springcore.service.mockito;

import com.training.springcore.model.mockito.Album;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MusicCatalogTest {

    @Mock
    Mock musicFinderMock;

    @InjectMocks
    MusicFinder musicFinder;



    @Test
    public void albumExists(){
        // Renvoie toujours une liste d'album avec un élément quelque soit l'argument
        when(musicFinder.findByArtist(anyString())).thenReturn(asList(new Album().withName("test")));

        // Renvoie toujours une liste d'album avec un élément quand l'argument est égale à "Muse"
        when(musicFinder.findByArtist(eq("Muse"))).thenReturn(asList(new Album().withName("test")));


        // Renvoie une exception
        when(musicFinder.findByArtist(eq("Muse"))).thenThrow(new IllegalArgumentException());
    }
}
