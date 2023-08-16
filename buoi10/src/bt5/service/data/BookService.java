package bt5.service.data;

import bt5.entities.Book;
import bt5.service.Library;
import bt5.service.impl.BookImpl;

import java.util.Scanner;

public class BookService {
    public void createBook(Scanner scanner){
        Library<Book> bookLibrary=new BookImpl();

        Book book1=new Book(1,"Java Programming", "Programming", "John Doe", 10);
        Book book2=new Book(2,"Python Basics", "Programming", "Jane Smith", 15);
        Book book3=new Book( 3,"Introduction to Algorithms", "Computer Science", "Thomas Johnson", 8);

        bookLibrary.add(book1);
        bookLibrary.add(book2);
        bookLibrary.add(book3);

        System.out.println("Nhap id sach muon kiem : ");
        int searchBookId=Integer.parseInt(scanner.nextLine());
        Book foundBook=bookLibrary.findById(searchBookId);
        if(foundBook!=null){
            System.out.println(foundBook.toString());
        }
        else System.out.println("None");

        System.out.println("Nhap id sach muon sua : ");
        int editBookId=Integer.parseInt(scanner.nextLine());
        Book editBook=bookLibrary.findById(editBookId);
        if(editBook!=null) {
            System.out.println("Nhap ten moi: ");
            editBook.setName(scanner.nextLine());
            System.out.println("Nhap topic moi: ");
            editBook.setTopic(scanner.nextLine());
            System.out.println("Nhap author moi: ");
            editBook.setAuthor(scanner.nextLine());
            System.out.println("Nhap so luong con lai: ");
            editBook.setNumRemain(Integer.parseInt(scanner.nextLine()));
            bookLibrary.edit(editBook);
            System.out.println(editBook.toString());
        }
        else System.out.println("None");


        int delBookId=Integer.parseInt(scanner.nextLine());
        Book delBook=bookLibrary.del(delBookId);
        if(delBook!=null){
            System.out.println("Sach co id: "+delBookId+" da bi xoa");
        }
        else System.out.println("None");
    }
}
