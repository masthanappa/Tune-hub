package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitis.Playlist;

public interface PlaylistRepositry extends JpaRepository<Playlist, Integer>{

}
