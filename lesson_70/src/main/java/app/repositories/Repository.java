package main.java.app.repositories;

import java.util.List;

public interface Repository<T> {

    List<T> getAll();

    T getById(int id);

    T save(T obj);

    void deleteById(int id);
}