package com.practicesystem.controller;

import com.practicesystem.pojo.Music;
import com.practicesystem.pojo.Result;
import com.practicesystem.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/musics")
    public Result getMusic(){
        List<Music> list =musicService.findAll();
        return Result.success(list);
    }

    @DeleteMapping("/musics")
    public Result deleteMusic(Integer id){
        musicService.deleteById(id);
        System.out.println("删除了id = " + id);
        return Result.success();
    }
}
