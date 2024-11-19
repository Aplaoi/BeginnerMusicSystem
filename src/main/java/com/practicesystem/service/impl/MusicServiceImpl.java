package com.practicesystem.service.impl;

import com.practicesystem.mapper.MusicMapper;
import com.practicesystem.pojo.Music;
import com.practicesystem.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicMapper musicMapper;

    @Override
    public List<Music> findAll(){
        return musicMapper.findAll();
    }

    @Override
    public void deleteById(Integer id){
        musicMapper.deleteById(id);
    }
}