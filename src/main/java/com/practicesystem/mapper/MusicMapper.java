package com.practicesystem.mapper;

import com.practicesystem.pojo.Music;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicMapper {

    List<Music> findAll();
    void deleteById(Integer id);
}
