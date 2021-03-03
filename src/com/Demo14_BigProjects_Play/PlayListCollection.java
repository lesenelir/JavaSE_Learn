package com.Demo14_BigProjects_Play;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 播放列表集合类  - 播放器类
public class PlayListCollection {
    Map<String, PlayList>  playListMap;  // 存放播放列表的集合

    // constructor
    public PlayListCollection() {
        playListMap = new HashMap<String, PlayList>();
    }

    // getter | setter
    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    // 向播放列表集合中存放播放列表
    public void addPlayList(PlayList playList) {
        // 播放列表名称作为key
        playListMap.put(playList.getPlayListName(), playList);
    }

    // 删除播放列表集合中的某个播放列表
    public void deletePlayList(PlayList playList) {
        playListMap.remove(playList.getPlayListName());
        System.out.println("删除成功");
    }

    // 通过播放列表的名称查询播放列表
    public PlayList searchPlayListByName(String playListName) {
        PlayList playList = null;
        Set<String> playListSet = playListMap.keySet();
        for (String s: playListSet) {
            if (s.equals(playListName)) {
                playList = playListMap.get(s);
                break;
            }
        }
        return playList;
    }

    // 显示所有播放列表的名称
    public void displayListName() {
        Set<String> playListSet = playListMap.keySet();
        System.out.println("播放列表名称为：");
        for (String s: playListSet) {
            System.out.println(s);
        }
    }

}
