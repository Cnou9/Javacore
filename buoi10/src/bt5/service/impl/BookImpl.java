package bt5.service.impl;

import bt5.entities.Book;
import bt5.service.Library;

import java.util.ArrayList;
import java.util.List;

public class BookImpl  implements Library<Book> {

    private List<Book> books=new ArrayList<>();


    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book findById(int id) {
        for (Book b:books){
            if(b.getId()==id){
                return b;
            }
        }
        return null;
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Book del(int id) {
        books.removeIf(book -> book.getId()==id);
        return null;
    }

    @Override
    public void edit(Book book) {
        for(int i=0;i<books.size();i++){
            if(books.get(i).getId()==book.getId()){
                books.set(i,book);
                break;
            }
        }
    }
}
