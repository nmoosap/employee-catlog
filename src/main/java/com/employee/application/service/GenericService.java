package com.employee.application.service;

import java.util.List;

public interface GenericService<E, K> {

     List<E> getAll();

     E findById(K id);

     E add(E entity);

     E update(E entity);

     void remove(E entity);

     void removeById(K id);

}
