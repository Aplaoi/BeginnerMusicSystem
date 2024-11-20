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

    //获取所有歌曲
    @GetMapping("/musics")
    public Result getMusic(){
        List<Music> list =musicService.findAll();
        return Result.success(list);
    }

    //删除歌曲
    @DeleteMapping("/musics")
    public Result deleteMusic(Integer id){
        musicService.deleteById(id);
        System.out.println("删除了id = " + id);
        return Result.success();
    }

    //新增歌曲
    @PostMapping("/musics")
    public Result insertMusic(@RequestBody Music music){
        musicService.insertMusic(music);
        System.out.println("新增music = " + music.getName()+music.getSinger());
        return Result.success(music);
    }

    //获取对应id的歌曲信息
    @GetMapping("/musics/{id}")
    public Result findById(@PathVariable Integer id){
        Music music=musicService.findById(id);
        System.out.println("找到id = " + id);
        return Result.success(music);
    }

    //修改相应歌曲信息
    @PutMapping("/musics")
    public Result updateMusic(@RequestBody Music music){
        musicService.updateMusic(music);
        System.out.println("修改的music = " + music.getName()+music.getSinger());
        return Result.success(music);
    }
}
