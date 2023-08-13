package utitiles;

import java.util.Scanner;

public class InputHelper{
    public  static String readString(String prompt,Scanner scanner ){
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static int readInt(String prompt,Scanner scanner){
        System.out.println(prompt);
        return Integer.parseInt(scanner.nextLine());
    }
}
