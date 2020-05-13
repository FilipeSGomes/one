package com.br.one.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.one.service.CrudService;

public abstract class CrudController<T, ID extends Serializable> {

    protected abstract CrudService<T, ID> getService();

    @GetMapping
    public List<T> findAll() {
        return getService().findAll();
    }

    @PostMapping
    public T save(@RequestBody T entity) {
        return getService().save(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
    	getService().delete(id);
    }

    @PutMapping()
    public T update(@RequestBody T entity) { 
    	return getService().update(entity);
    }
    
}