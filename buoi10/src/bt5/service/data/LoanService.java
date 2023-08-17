package bt5.service.data;

import bt5.entities.Book;
import bt5.entities.Loan;
import bt5.entities.Reader;
import bt5.service.Library;
import bt5.service.impl.BookImpl;
import bt5.service.impl.LoanImpl;
import bt5.service.impl.ReaderImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LoanService {
    public void createLoan(Scanner scanner){
        Library<Loan> loanLibrary=new LoanImpl();
        Library<Book> bookLibrary=new BookImpl();
        Library<Reader> readerLibrary=new ReaderImpl();

        Book book1=new Book(1,"Java Programming", "Programming", "D", 10);
        Book book2=new Book(2,"Python Basics", "Programming", "J ", 15);
        Book book3=new Book( 3,"Introduction to Algorithms", "C", "T", 8);
        bookLibrary.add(book1);
        bookLibrary.add(book2);
        bookLibrary.add(book3);
        Reader reader1=new Reader(1,"A",8432,"HN");
        Reader reader2=new Reader(2,"B",8444,"HN");
        Reader reader3=new Reader( 3,"C",8213,"HN");
        readerLibrary.add(reader1);
        readerLibrary.add(reader2);
        readerLibrary.add(reader3);



        System.out.println("Nhap id nguoi doc: ");
        int readerID=Integer.parseInt(scanner.nextLine());
        Reader borrower=readerLibrary.findById(readerID);
        if(borrower==null) {
            System.out.println("Khong tim thay nguoi dung co id " + readerID);
            return;
        }

        System.out.println("Nhap id sach: ");
        int bookId=Integer.parseInt(scanner.nextLine());
        Book borrowBook=bookLibrary.findById(bookId);
        if(borrowBook==null){
            System.out.println("Khong tim thay sach co id: "+bookId);
            return;
        }

        Date startDate=new Date();

        Calendar endCalender=Calendar.getInstance();
        endCalender.setTime(startDate);
        endCalender.add(Calendar.DAY_OF_MONTH,10);
        Date endDate=endCalender.getTime();

        Loan loan=new Loan(borrower,borrowBook,startDate,endDate);
        loanLibrary.add(loan);
        System.out.println("Tao phieu muon thanh cong");
        System.out.println("Nguoi muon: "+borrower.getName());
        System.out.println("Sach muon: "+borrowBook.getName());
        System.out.println("Ngay muon: "+startDate);
        System.out.println("Han tra: "+endDate);

    }

}
