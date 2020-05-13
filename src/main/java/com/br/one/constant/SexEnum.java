package com.br.one.constant;

public enum SexEnum {

	MALE("male"), 
	FEMININE("feminine"),
	OUTHER("outher");

	private final String name;

	private SexEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
