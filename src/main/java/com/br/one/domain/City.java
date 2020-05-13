package com.br.one.domain;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.one.constant.StateEnum;
@Entity
public class City implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String city;
		
	@Column
	private StateEnum state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StateEnum getState() {
		return state;
	}

	public void setState(String state) {
		try {
			this.state = StateEnum.valueOf(state);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException ("Invalid Input. Possible values: " + Arrays.toString(StateEnum.values()));
		}
	}

	public String getCity() {
		return city.toUpperCase();
	}

	public void setCity(String city) {
		this.city = city.toLowerCase();
	}

}
