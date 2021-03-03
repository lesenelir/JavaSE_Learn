package com.Demo14_BigProjects_Play;

public class Test {

    // 对歌曲类进行测试
    public void testSong() {
        Song song1 = new Song("s001", "making", "111");
        Song song2 = new Song("s001", "making", "111");
        System.out.println(song1);
        // 测试是否相等
        System.out.println("song1 == song2 ? " + song1.equals(song2));  // 重写hashCode和equals方法比较对应值是否相等，不是比较对象的地址是否相等
    }

    // 对播放列表进行测试
    public void testPlayList() {
        Song song1 = new Song("s001", "making", "111");
        Song song2 = new Song("s002", "making", "222");
        // 创建playList
        PlayList mainPlayList = new PlayList("主播放列表");
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        // 显示内容
        mainPlayList.displayAllSong();
        // 通过id查询歌曲信息
        Song song = mainPlayList.searchSongById("s001");
        if (song != null) {
            System.out.println("根据ID查询的歌曲信息：");
            System.out.println(song);
        } else {
            System.out.println("该歌曲不存在");
        }
        // 通过name查询歌曲信息
        song = null;
        song = mainPlayList.searchSongByName("making");
        if (song != null) {
            System.out.println("根据Name查询的歌曲信息：");
            System.out.println(song);
        } else {
            System.out.println("该歌曲不存在");
        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testSong();
        test.testPlayList();
    }
}
