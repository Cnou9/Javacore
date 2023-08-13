import entities.User;
import service.LoginService;
import service.RegisterService;
import service.UserService;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        UserService userService=new UserService();
        LoginService loginService=new LoginService(userService);
        Scanner scanner = new Scanner(System.in);
        Menu menu=new Menu();
        ArrayList<User> intialUsers=new ArrayList<>();
        ArrayList<User> users=new ArrayList<>();
        User user1=new User("user1", "user1@example.com", "password@1");

        userService.save(user1);
        Menu.displayMenuLogin(scanner,userService);

        scanner.close();


    }

}
