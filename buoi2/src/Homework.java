import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("moi ban nhap ten hang nhap kho: ");
        String name=scanner.nextLine();


        System.out.println("moi ban nhap ngay sinh: ");
        String birth= scanner.nextLine();
        LocalDate birthDay=LocalDate.parse(birth, DateTimeFormatter.ofPattern("yyyy/MM/dd"));


        System.out.println("moi ban nhap ngay gio nhap hang: ");
        String timeTake= scanner.nextLine();
        LocalDateTime timeTake_convert=LocalDateTime.parse(timeTake, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));


        System.out.println("moi ban nhap thoi gian: ");
        String timeNow= scanner.nextLine();
        LocalTime timeNow_convert=LocalTime.parse(timeNow,DateTimeFormatter.ofPattern("HH:mm:ss"));


        System.out.println("hang nhap: "+name);
        System.out.println("ngay sinh: "+birthDay);
        System.out.println("thoi gian nhap hang: "+timeTake_convert);
        System.out.println("thoi gian: "+timeNow_convert);
    }
}
