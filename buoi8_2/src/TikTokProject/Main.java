package TikTokProject;

import TikTokProject.Service.FollowerService;
import TikTokProject.Service.IdolService;
import TikTokProject.Service.SongService;
import TikTokProject.entilies.Follower;
import TikTokProject.entilies.Idol;
import TikTokProject.entilies.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        IdolService idolService=new IdolService();
        ArrayList<Idol> idol=idolService.createIdol(scanner);


        FollowerService followerService=new FollowerService();
        ArrayList<Follower> followers=followerService.createFollower(scanner);


        SongService songService=new SongService();
        ArrayList<Song> songs=songService.createSong(scanner);

        System.out.println(idol);
        System.out.println(followers);
        System.out.println(songs);
    }
}
