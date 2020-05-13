package com.br.one.service;

import java.util.List;

import com.br.one.constant.StateEnum;
import com.br.one.domain.City;

public interface CityService extends CrudService<City, Long>  {

	public List<City> findByNameCity(String nameCity);
	
	public List<City> findByNameState(StateEnum nameState);
	
}
