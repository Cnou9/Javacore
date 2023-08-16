package bt5;

import bt5.entities.Book;
import bt5.service.Library;
import bt5.service.data.BookService;
import bt5.service.data.LoanService;
import bt5.service.data.ReaderService;
import bt5.service.impl.BookImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        BookService bookService=new BookService();
//        bookService.createBook(scanner);
//        ReaderService readerService=new ReaderService();
//        readerService.createReader(scanner);
        LoanService loanService=new LoanService();
        loanService.createLoan(scanner);






    }
}
