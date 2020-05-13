package com.br.one.service;

import java.io.Serializable;
import java.util.List;

public interface CrudService<T, ID extends Serializable> {

	List<T> findAll();

	T save(T entity);

	T update(T entity);
	
	void delete(Long id);

}
