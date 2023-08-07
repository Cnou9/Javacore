package SummonRift.Service;

import SummonRift.entilies.Player;
import SummonRift.entilies.Team;

import java.util.Scanner;

public class TeamService {
    public Team createTeam(Scanner scanner, String teamName){
        Team team=new Team(teamName);
        System.out.println("nhap thong tin cho doi "+teamName+": ");
        for(int i=0;i<3;i++){
            System.out.println("nhap ten tuong #"+(i+1)+": ");
            String playerName= scanner.nextLine();
            System.out.println("nhap vi tri tuong #"+(i+1)+": ");
            String position= scanner.nextLine();
            Player player=new Player(playerName,position);
            team.addPlayers(player);
        }
        return team;
    }
    public void displayInfo(Team team){
        System.out.println("Thong tin doi "+team.getName()+": " );
        for(int i=0;i<3;i++){
            Player player=team.getPlayers().get(i);
            System.out.println("Tướng: "+player.getName()+" vị trí: "+player.getPosition());
        }
    }

}
