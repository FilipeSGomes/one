package com.br.one.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.br.one.service.CrudService;
@SuppressWarnings("unchecked")
public abstract class CrudServiceImpl<T, ID extends Serializable> implements CrudService<T, ID> {

    protected abstract JpaRepository<T, ID> getData();

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll() {
        return getData().findAll();
    }
    
	@Override
    @Transactional(readOnly = true)
    public T findById(Long id) {
    	if(id == null)
    		return null;
        return getData().findById((ID) id).orElse(null);
    }

	@Override
    @Transactional
    public void delete(Long id) {
        getData().deleteById((ID)id);
    }

    @Override
    @Transactional
    public T save(T entity) {
        return getData().save(entity);
    }

    
    @Override
    @Transactional
    public T update(T entity) {
        return getData().save(entity);
    }    
}