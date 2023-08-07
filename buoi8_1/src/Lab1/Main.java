package Lab1;

import Service.FamilyService;
import entile.Family;
import entile.Member;
import Service.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so member muon tao: ");
        int n=Integer.parseInt(scanner.nextLine());
        MemberService memberService=new MemberService();
        FamilyService familyService=new FamilyService();
        ArrayList<Member> members=new ArrayList<>();

        Family family=familyService.InputInfoFamily(scanner,memberService,members);

        System.out.println(family);
    }
}
