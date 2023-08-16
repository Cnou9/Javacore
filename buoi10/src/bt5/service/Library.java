package bt5.service;

import bt5.entities.Book;

import java.util.List;

public interface Library<T> {
    List<T> getAll();
    T findById(int id);
    void add(T item);
    T del(int id);
    void edit(T item);





}
