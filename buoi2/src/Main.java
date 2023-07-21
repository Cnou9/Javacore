import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
//        String name = "   Hello";
//        String name2= "hhhhhhh";
//        name.toUpperCase();
//        System.out.println("name: "+name.toUpperCase());
//        System.out.println("name: "+name.trim());
//        System.out.println("name: "+name.length());
//        System.out.println(name.charAt(6));
//
//        String address = new String("Ha Noi");
//        String address2= new String("hhhhhhh");
//        System.out.println(name2.equals(address));
//        System.out.println(name2.equalsIgnoreCase(address));
//
//        System.out.println("\\");
//        System.out.println("\"\"");
//        System.out.println("\tasfasf");
//        System.out.println("abc\nabc");
//
//        Integer a=500;
//        int b=a.intValue();
//        System.out.println(b);

//        System.out.println(LocalDate.now());
//        System.out.println(LocalDate.of(2023,07,20));
//        LocalDate localDate=LocalDate.of(2023,12,12);
//        LocalDate localDate2=localDate.plusDays(2);
//        LocalDate localDate3=LocalDate.of(2023,07,29);
//        System.out.println(localDate2);
//        System.out.println(localDate.compareTo(localDate3));
//
//        LocalTime localTime= LocalTime.now();
//        System.out.println(localTime);
//        LocalTime localTime1=LocalTime.of(1,50,32,222);
//        System.out.println(localTime1);
//
//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDateTime);

//        String dateTime="2023/03/20 20:36:22";
//        LocalDateTime localDateTime=LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
//        System.out.println(localDateTime);

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten: ");
        String name =scanner.nextLine();
        System.out.println("name: "+name.toUpperCase(Locale.ROOT));
        System.out.println("nhap tuoi: ");
        int age=scanner.nextInt();
        System.out.println("tuoi: "+age);

    }

}
