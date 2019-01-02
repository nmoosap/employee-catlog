package com.employee.application.service;

import com.employee.application.dao.GenericDao;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K> {

    private GenericDao<E, K> genericDao;

    public GenericServiceImpl() {
    }

    public GenericServiceImpl(GenericDao<E, K> genericDao) {
        this.genericDao = genericDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<E> getAll() {
        return genericDao.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public E findById(K id) {
        Optional<E> entity = genericDao.findById(id);
        return entity.orElse(null);
    }

    @Override
    @Transactional
    public E add(E entity) {
        return genericDao.add(entity);
    }

    @Override
    @Transactional
    public E update(E entity) {
        return genericDao.update(entity);
    }

    @Override
    @Transactional
    public void remove(E entity) {
        genericDao.remove(entity);
    }

    @Override
    @Transactional
    public void removeById(K id) {
        genericDao.removeById(id);
    }
}
