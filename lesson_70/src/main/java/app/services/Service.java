package main.java.app.services;

import java.util.List;

public interface Service<T> {

    List<T> getAll();

    T getById(int id);

    T save(T obj);

    void deleteById(int id);
}