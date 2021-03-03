package com.Demo14_BigProjects_Play;

import java.util.ArrayList;
import java.util.List;

// 播放列表类
public class PlayList {
    private String playListName;
    private List<Song> musicList;  // 播放列表歌曲集合

    // constructor
    public PlayList() {
    }

    public PlayList(String playListName, List<Song> musicList) {
        this.playListName = playListName;
        this.musicList = musicList;
    }

    public PlayList(String playListName) {
        this.playListName = playListName;
        musicList = new ArrayList<Song>();
    }

    // getter | setter
    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    // 将歌曲添加到播放列表
    public void addToPlayList(Song song) {
        // 排除重复添加的情况
        boolean flag = false;
        for (Song s: musicList) {
            if (s.equals(song)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("该歌曲存在于列表中，添加失败");
        } else {
            musicList.add(song);
        }
    }

    // 显示播放列表的所有歌曲
    public void displayAllSong() {
        System.out.println("播放列表的所有歌曲为：");
        for (Song s: musicList) {
            System.out.println(s);
        }
    }

    // 通过歌曲ID查询歌曲
    public Song searchSongById(String id) {
        Song song = null;
        for (Song s: musicList) {
            if (s.getId().equals(id)) {
                song = s;
                break;
            }
        }
        return song;
    }

    // 通过歌曲Name查询歌曲
    public Song searchSongByName(String name) {
        Song song = null;
        for (Song s: musicList) {
            if (s.getName().equals(name)) {
                song = s;
                break;
            }
        }
        return song;
    }

    // 修改播放列表中的歌曲信息
    public void updateSong(String id, Song song) {
        // 根据id查询到播放列表中的信息，再进行修改
        Song song1 = searchSongById(id);
        if (song1 == null) {
            System.out.println("没有找到ID为" + id + "的歌曲");
        } else {
            musicList.remove(song1);
            musicList.add(song);
            System.out.println("修改成功");
        }
    }

    // 删除播放列表中的歌曲信息
    public void deleteSong(String id) {
        Song song = searchSongById(id);
        if (song == null) {
            System.out.println("没有找到ID为" + id + "的歌曲");
        } else {
            musicList.remove(song);
        }
    }

}
