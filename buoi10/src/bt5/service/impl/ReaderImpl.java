package bt5.service.impl;

import bt5.entities.Book;
import bt5.entities.Reader;
import bt5.service.Library;

import java.util.ArrayList;
import java.util.List;

public class ReaderImpl implements Library<Reader>{

    private List<Reader> readers=new ArrayList<>();


    @Override
    public List<Reader> getAll() {
        return readers;
    }

    @Override
    public Reader findById(int id) {
        for(Reader r:readers){
            if(r.getId()==id) return r;
        }
        return null;
    }

    @Override
    public void add(Reader reader) {
        readers.add(reader);
    }

    @Override
    public Reader del(int id) {
        readers.removeIf(reader -> reader.getId()==id);
        return null;
    }

    @Override
    public void edit(Reader reader) {
        for(int i=0;i<readers.size();i++){
            if(readers.get(i).getId()==reader.getId()){
                readers.set(i,reader);
                break;
            }
        }

    }
}
