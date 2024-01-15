package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitis.Song;

public interface SongRepositry extends JpaRepository<Song, Integer> {

public	Song findByName(String name);

}
