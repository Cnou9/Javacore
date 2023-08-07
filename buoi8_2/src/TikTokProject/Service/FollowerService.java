package TikTokProject.Service;

import TikTokProject.entilies.Follower;

import java.util.ArrayList;
import java.util.Scanner;

public class FollowerService {
    public ArrayList<Follower> createFollower(Scanner scanner){
        ArrayList<Follower> followers=new ArrayList<>();
        System.out.println("nhap so luong follower: ");
        int numFollow=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<numFollow;i++){
            System.out.println("nhap ten follower: ");
            String name= scanner.nextLine();
            System.out.println("nhap email: ");
            String email= scanner.nextLine();
            System.out.println("nhap so lan like: ");
            int numberOfLike=Integer.parseInt(scanner.nextLine());
            Follower follower=new Follower(name,email,numberOfLike);
            followers.add(follower);
        }
        return followers;

    }
}
