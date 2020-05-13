package com.br.one.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.one.constant.SexEnum;
@Entity
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private SexEnum sexo;
	
	@Column
	private LocalDate dateBirth;
	
	@Column
	private int idade;
	
	@Column
	private String cityInLive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SexEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexEnum sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCityInLive() {
		return cityInLive;
	}

	public void setCityInLive(String cityInLive) {
		this.cityInLive = cityInLive;
	}
	
	

	
	
}
