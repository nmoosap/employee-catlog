package com.employee.application.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K> {

    @Autowired
    private JpaRepository<E, K> repository;

    @Override
    public List<E> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<E> findById(K id) {
        return repository.findById(id);
    }

    @Override
    public E add(E entity) {
        return repository.save(entity);
    }

    @Override
    public E update(E entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(E entity) {
        repository.delete(entity);
    }

    @Override
    public void removeById(K id) {
        repository.deleteById(id);
    }
}
