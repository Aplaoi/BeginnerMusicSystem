package com.practicesystem.mapper;

import com.practicesystem.pojo.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MusicMapper {
    List<Music> findAll();

    void deleteById(Integer id);

    void insertMusic(Music music);

    void updateMusic(Music music);

    Music findById(Integer id);
}
