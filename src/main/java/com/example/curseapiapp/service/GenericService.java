package com.example.curseapiapp.service;

import java.util.List;

public interface GenericService<T, ID> {
    List<T> loadAll();
    T create (T t);
    T getById (ID id);
    T update (T t);
    void delete (ID id);
}