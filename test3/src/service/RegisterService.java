package service;

import entities.User;
import utitiles.InputHelper;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterService {
    private UserService userService;
    private List<String> registedUsername;
    private List<String> registedEmail;

    public RegisterService(UserService userService) {
        this.userService = userService;
        this.registedUsername = new ArrayList<>();
        this.registedEmail = new ArrayList<>();
    }

    public User register(Scanner scanner){
        String username= InputHelper.readString("Nhập username: ",scanner);
        if(userService.findUserByUsername(username)!=null){
            System.out.println("Username đã tồn tại!");
            return null;
        }
        String email=InputHelper.readString("Nhập email",scanner);
        if(!userService.isValidEmail(email)||userService.emailExists(email)){
            System.out.println("Email không hợp lệ hoặc đã tồn tại!");
            return null;
        }
        String password=InputHelper.readString("Nhập password: ",scanner);
        if(!userService.isValidPassword(password)){
            System.out.println("Password không hợp lệ!");
            return null;
        }

        registedUsername.add(username);
        registedEmail.add(email);
        User user =new User(username,email,password);
        userService.save(user);
        System.out.println("Tài khoản đã được tạo thành công ^^");
        return user;
    }
    private boolean isUsernameRegisted(String username){
        return registedUsername.contains(username);
    }

    private boolean isEmailRegisted(String email){
        return registedEmail.contains(email);
    }

}