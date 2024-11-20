package com.practicesystem.service;

import com.practicesystem.pojo.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    void deleteById(Integer id);
    void insertMusic(Music music);
    void updateMusic(Music music);
    Music findById(Integer id);
}
