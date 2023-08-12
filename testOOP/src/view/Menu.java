package view;

import entities.User;
import service.LoginService;
import service.RegisterService;
import service.UserService;
import utitiles.InputHelper;

import java.util.Scanner;

public class Menu {
    public void displayMenuChange(UserService userService,User user, Scanner scanner){
        System.out.println("Chọn một tác vụ:");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");

            do {
               LoginService loginService=new LoginService(userService);


                int choose= InputHelper.readInt("Lựa chọn: ",scanner);

                switch (choose) {
                    case 1 -> loginService.changeUsername(userService, user, scanner);
                    case 2 -> loginService.changeEmail(userService, user, scanner);
                    case 3 -> loginService.changePassword(userService, user, scanner);
                    case 4 -> {
                        System.out.println("Đã đăng xuất.");
                        displayMenuLogin(scanner, userService);
                        return;
                    }
                    case 0 -> {
                        System.out.println("Tạm biệt!");
                        System.exit(0);
                    }
                    default -> System.out.println("Lựa chọn không hợp lệ");
                }
            } while (true);
        }

    public static void displayMenuLogin(Scanner scanner,UserService userService){
        System.out.println("1-Đăng nhập \n 2-Đăng ký \n 0-Thoát chương trình ");
        int choose=InputHelper.readInt("Lựa chọn: ",scanner);
        LoginService loginService=new LoginService(userService);
        RegisterService registerService=new RegisterService(userService);
        switch (choose){
            case 1:
                loginService.login(scanner);
                break;
            case 2:
                registerService.register(scanner);
                break;
            case 0:
                System.out.println("Goodbye ^^");
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }



}
