package com.br.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.one.constant.StateEnum;
import com.br.one.domain.City;
import com.br.one.service.CityService;
import com.br.one.service.CrudService;

@RestController
@RequestMapping("/city")
public class CityController extends CrudController<City, Long>{

	@Autowired
	private CityService service;
	
	@Override
	protected CrudService<City, Long> getService() {
		return service;
	}
	
	@GetMapping("{nameCity}")
	public List<City> findByNameCity(@RequestParam final String nameCity) {
		return service.findByNameCity(nameCity);
	}

	@GetMapping("{state}")
	public List<City> findByNameState(@RequestParam final StateEnum nameState) {
		return service.findByNameState(nameState);
	}
}
