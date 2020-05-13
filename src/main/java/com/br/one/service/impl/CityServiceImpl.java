package com.br.one.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.br.one.constant.StateEnum;
import com.br.one.domain.City;
import com.br.one.repository.CityRepository;
import com.br.one.service.CityService;
@Service
public class CityServiceImpl extends CrudServiceImpl<City, Long> implements CityService {

	@Autowired 
	private CityRepository repository;
	
	@Override
	protected JpaRepository<City, Long> getData() {
		return repository;
	}

	@Override
	public List<City> findByNameCity(String nameCity) {
		if(nameCity == null || nameCity.isEmpty())
			return null;
		return repository.findByCity(nameCity);
	}

	@Override
	public List<City> findByNameState(StateEnum nameState) {
		if(nameState == null)
			return null;
		return repository.findByState(nameState);
	}
	
	
}
