package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository  {
    private List<Song> list = new ArrayList<Song>();

    public SongRepository() {
        list.add(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975"));
        list.add(new Song(2, "Imagine", "John Lennon", "Imagine", "1971"));
    }

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(s.getId())) {
                list.set(i, s);
                return;
            }
        }
    }

    public void removeSong(Song s) {
        list.remove(s);
    }

}
