package bt5.entities;

import java.util.Date;

public class Loan {


     private Reader reader;
     private Book book;
     private Date startDate;
     private Date endDate;

     public Loan(Reader reader, Book book, Date startDate, Date endDate) {
          this.reader = reader;
          this.book = book;
          this.startDate = startDate;
          this.endDate = endDate;
     }

     public Reader getReader() {
          return reader;
     }

     public void setReader(Reader reader) {
          this.reader = reader;
     }

     public Book getBook() {
          return book;
     }

     public void setBook(Book book) {
          this.book = book;
     }

     public Date getStartDate() {
          return startDate;
     }

     public void setStartDate(Date startDate) {
          this.startDate = startDate;
     }

     public Date getEndDate() {
          return endDate;
     }

     public void setEndDate(Date endDate) {
          this.endDate = endDate;
     }
}
