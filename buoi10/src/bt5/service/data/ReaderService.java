package bt5.service.data;

import bt5.entities.Book;
import bt5.entities.Reader;
import bt5.service.Library;
import bt5.service.impl.ReaderImpl;

import java.util.List;
import java.util.Scanner;

public class ReaderService {
    public void createReader(Scanner scanner){
        Library<Reader> readerLibrary=new ReaderImpl();
        Reader reader1=new Reader(1,"A",8432,"HN");
        Reader reader2=new Reader(2,"B",8444,"HN");
        Reader reader3=new Reader( 3,"C",8213,"HN");

        readerLibrary.add(reader1);
        readerLibrary.add(reader2);
        readerLibrary.add(reader3);

        System.out.println("Nhap id nguoi dung : ");
        int searchReaderId=Integer.parseInt(scanner.nextLine());
        Reader foundReader=readerLibrary.findById(searchReaderId);
        if(foundReader!=null){
            System.out.println(foundReader.toString());
        }
        else System.out.println("None");

        System.out.println("Nhap id nguoi muon doi : ");
        int editReaderId=Integer.parseInt(scanner.nextLine());
        Reader editReader=readerLibrary.findById(editReaderId);
        if(editReader!=null) {
            System.out.println("Nhap ten moi: ");
            editReader.setName(scanner.nextLine());
            System.out.println("Nhap sdt moi: ");
            editReader.setNumPhone(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhap dia chi moi: ");
            editReader.setAddress(scanner.nextLine());
            readerLibrary.edit(editReader);
            System.out.println(editReader.toString());
        }
        else System.out.println("None");


        int delReaderId=Integer.parseInt(scanner.nextLine());
        Reader delReader=readerLibrary.del(delReaderId);
        if(delReader!=null){
            System.out.println("Nguoi dung co id: "+delReaderId+" da bi xoa");
        }
        else System.out.println("None");
    }
    }

