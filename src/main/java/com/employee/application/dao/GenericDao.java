package com.employee.application.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<E, K> {

	List<E> getAll();

	Optional<E> findById(K id);

	E add(E entity);

	E update(E entity);

	void remove(E entity);

	void removeById(K id);

}
