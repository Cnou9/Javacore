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
        RegisterService registerService=new RegisterService(userService);
        Scanner scanner = new Scanner(System.in);
        Menu menu=new Menu();
        ArrayList<User> users=new ArrayList<>();

        Menu.displayMenuLogin(scanner,userService);


    }

}
