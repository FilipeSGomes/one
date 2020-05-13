package com.br.one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.one.constant.StateEnum;
import com.br.one.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	public List<City> findByCity(String city);
	
	public List<City> findByState(StateEnum stateEnum);
}
