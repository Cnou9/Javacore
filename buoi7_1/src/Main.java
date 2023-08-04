import entile.SinhVienBiz;
import entile.SinhVienIT;
import entile.SInhVienTechmaster;
import service.StudentsService;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap so phan tu:");
        int n=Integer.parseInt(scanner.nextLine());
        SInhVienTechmaster[] listSinhVien=new SInhVienTechmaster[n];
        System.out.println("nhap ten: ");
        String name= scanner.nextLine();
        System.out.println("nhap chuyen nganh:");
        String major= scanner.nextLine();

        int count=0;

        do{
            System.out.println("nhap sinh vien Biz or IT?");
            String choose= scanner.nextLine();
            StudentsService service = new StudentsService();
            switch (choose) {
                case "B" -> {
                    listSinhVien[count] = service.createStudentBiz(scanner, name, major);
                }
                case "I" -> {
                    listSinhVien[count] = service.createStudentIT(scanner, name, major);
                }
            }
            count++;
        } while (count<n);
        System.out.println("danh sach sinh vien la: "+ Arrays.toString(listSinhVien));






    }
}
