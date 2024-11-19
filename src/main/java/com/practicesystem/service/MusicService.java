package com.practicesystem.service;

import com.practicesystem.pojo.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    void deleteById(Integer id);
}
