package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitis.Playlist;
import com.example.demo.repositry.PlaylistRepositry;

@Service
public class PlaylistServiceImpl implements PlaylistService{
@Autowired
PlaylistRepositry repo;
	@Override
	public void addPlaylist(Playlist playlist) {
		repo.save(playlist);
		
	}
	@Override
	public List<Playlist> fetchAllPlaylists() {
		
		return repo.findAll();
	}

}
