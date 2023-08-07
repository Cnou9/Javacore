package Service;

import entile.Member;

import java.util.Scanner;

public class MemberService {
    public Member createMember(Scanner scanner) {
        System.out.println("moi ban nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap ngay sinh: ");
        String dob = scanner.nextLine();
        System.out.println("moi ban nhap job: ");
        String job = scanner.nextLine();
        return new Member(name, dob, job);
    }
}
