package com.Demo14_BigProjects_Play;

import java.util.Objects;

public class Song {
    private String id;
    private String name;
    private String singer;

    // constructor
    public Song() {
    }

    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    // getter | setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    // hashcode & equals   [播放列表不能重复歌曲]
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) &&
                Objects.equals(name, song.name) &&
                Objects.equals(singer, song.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, singer);
    }

    // toString
    @Override
    public String toString() {
        return "歌曲信息：[" +
                "歌曲ID：" + id + '\'' +
                ", 歌曲名字：" + name + '\'' +
                ", 演唱者：" + singer + '\'' +
                ']';
    }
}
