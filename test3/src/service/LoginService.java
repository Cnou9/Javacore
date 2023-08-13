package service;

import entities.User;


import view.Menu;
import utitiles.InputHelper;
import java.util.Scanner;

public class LoginService {
    private UserService userService;

    public LoginService(UserService userService) {

        this.userService = userService;
    }

    public void login(User registedUser, Scanner scanner){
        String username= utitiles.InputHelper.readString("Nhập username: ", scanner);
        String password= utitiles.InputHelper.readString("Nhập password: ",scanner);



        User user=userService.findUserByUsername(username);
        userService.save(user);
        if(user==null){
            System.out.println("Kiểm tra lại username!");
        } else if(user.getPassword().equals(password)){
            System.out.println("Chào mừng "+user.getUsername()+", bạn có thể thực hiện các công việc sau: ");
            Menu menu=new Menu();
            menu.displayMenuChange(userService,user,scanner);
        }
        else {
            System.out.println("Sai password. Chọn \n 1-Đăng nhập lại \n 2-Quên mật khẩu");
            int choose=Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> login(registedUser, scanner);
                case 2 -> forgotPassword(scanner);
                default -> System.out.println("không hợp lệ");
            }
        }
    }

    public void changeUsername(UserService userService, User user, Scanner scanner){
        String newUsername= utitiles.InputHelper.readString("Nhập username mới: ",scanner);
        if(userService.findUserByUsername(newUsername)!=null){
            System.out.println("Username đã tồn tại!");
            return;
        }
        user.setUsername(newUsername);
        System.out.println("Username thay đổi thành công");
    }

    public void changeEmail(UserService userService, User user, Scanner scanner){
        String newEmail=InputHelper.readString("Nhập email mới: ",scanner);
        if(userService.findUserByUsername(newEmail)!=null){
            System.out.println("email đã tồn tại!");
            return;
        }
        user.setUsername(newEmail);
        System.out.println("email thay đổi thành công");
    }

    public void changePassword(UserService userService, User user, Scanner scanner){
        String newPassword=InputHelper.readString("Nhập pass mới: ",scanner);
        if(!userService.isValidPassword(newPassword)){
            System.out.println("Mật khẩu không hợp lệ!");
            return;
        }
        user.setUsername(newPassword);

        System.out.println("password thay đổi thành công");
    }

    private void resetPassword(User user,Scanner scanner) {
        changePassword(userService,user,scanner);

        // Đăng nhập lại sau khi đổi mật khẩu
        User registedUser = null;
        login(registedUser, scanner);
    }

    private void forgotPassword(Scanner scanner) {
        String email = InputHelper.readString("Nhập email của bạn: ",scanner);
        User user=userService.findUserByEmail(email);

        if (user != null) {
            resetPassword(user,scanner);
        } else {
            System.out.println("Email không tồn tại trong hệ thống.");
        }
    }


}