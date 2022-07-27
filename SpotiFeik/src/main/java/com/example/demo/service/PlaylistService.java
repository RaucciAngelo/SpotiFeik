package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Playlist;
import com.example.demo.repository.PlaylistRepo;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepo playlistRepo;

    public List<Playlist> getAllPlaylist(){
        return playlistRepo.findAll();
    }

    public void savePlaylist(Playlist playlist) {
        playlistRepo.save(playlist);
    }


    public void deletePlaylist(Long id) {
        playlistRepo.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public void update(Long id, Playlist playlist) {
        Playlist updateP= new Playlist();
        updateP = playlistRepo.getById(id);
        updateP.setName(playlist.getName());
        updateP.setDuration(playlist.getDuration());
        updateP.setnTrack(playlist.getnTrack());
        playlistRepo.save(updateP);
    }
}