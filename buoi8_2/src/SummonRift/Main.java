package SummonRift;

import SummonRift.entilies.Team;
import SummonRift.Service.TeamService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        TeamService team=new TeamService();
        Team team1=team.createTeam(scanner,"SKT");
        Team team2=team.createTeam(scanner,"G2");
        team.displayInfo(team1);
        team.displayInfo(team2);

    }
}
