package service;

import entities.User;
import utitiles.InputHelper;

import java.util.Scanner;

public class RegisterService {
    private UserService userService;

    public RegisterService(UserService userService) {
        this.userService = userService;
    }
    public void register(Scanner scanner){
        String username= InputHelper.readString("Nhập username: ",scanner);
        if(userService.findUserByUsername(username)!=null){
            System.out.println("Username đã tồn tại!");
            return;
        }
        String email=InputHelper.readString("Nhập email",scanner);
        if(!userService.isValidEmail(email)||userService.emailExists(email)){
            System.out.println("Email không hợp lệ hoặc đã tồn tại!");
            return;
        }
        String password=InputHelper.readString("Nhập password: ",scanner);
        if(userService.isValidPassword(password)){
            System.out.println("Password không hợp lệ!");
            return;
        }

        User user =new User(username,email,password);
        userService.save(user);
        System.out.println("Tài khoản đã được tạo thành công ^^");


    }
}
