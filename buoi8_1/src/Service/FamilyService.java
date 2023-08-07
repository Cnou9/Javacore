package Service;

import entile.Family;
import entile.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyService {
    public Family InputInfoFamily(Scanner scanner,MemberService memberService,ArrayList<Member> members) {
        System.out.println("nhap dia chi ho dan: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so luong thanh vien trong gia dinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Member member = memberService.createMember(scanner);
            members.add(member);
        }
        Family family=new Family(address,members);
        return family;
    }
}
