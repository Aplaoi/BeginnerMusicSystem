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

    @PostMapping("/musics")
    public Result insertMusic(@RequestBody Music music){
        musicService.insertMusic(music);
        System.out.println("新增music = " + music.getName()+music.getSinger());
        return Result.success(music);
    }

    @GetMapping("/musics/{id}")
    public Result findById(@PathVariable Integer id){
        musicService.findById(id);
        System.out.println("找到id = " + id);
        return Result.success();
    }

    @PutMapping("/musics")
    public Result updateMusic(@RequestBody Music music){
        musicService.updateMusic(music);
        System.out.println("修改的music = " + music.getName()+music.getSinger());
        return Result.success(music);
    }
}
