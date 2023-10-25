package dev.mn.test.repositories;

import java.util.List;
import java.util.Optional;

public interface IRepositories<T>{
    boolean insert(T t);
    boolean update(T t);
    boolean delete(String id);
    Optional<T> findById(String id);
    List<T> findAll();
}
