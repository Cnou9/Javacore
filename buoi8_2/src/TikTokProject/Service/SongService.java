package TikTokProject.Service;

import TikTokProject.entilies.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class SongService {
    public ArrayList<Song> createSong(Scanner scanner){
        ArrayList<Song> songs=new ArrayList<>();

        System.out.println("nhap so luong bai hat: ");
        int numSong=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<numSong;i++){
        System.out.println("nhap ten bai hat: ");
        String nameSong= scanner.nextLine();
        System.out.println("nhap ten ca sy: ");
        String nameSinger= scanner.nextLine();
        Song song=new Song(nameSong,nameSinger);
        songs.add(song);
    }
        return songs;
    }


}
