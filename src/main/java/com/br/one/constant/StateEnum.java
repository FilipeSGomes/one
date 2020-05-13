package com.br.one.constant;

public enum StateEnum {

	AC("Acre"), 
	AL("Alagoas"),
	AP("Amapa"), 
	AM("Amazonas"),
	BA("Bahia"), 
	CE("Ceara"),
	DF("Distrito Fedaral"), 
	ES("Espirito Santo"),
	GO("Goias"), 
	MA("Maranhao"),
	MT("Mato Grosso"), 
	MS("Mato Grosso do Sul"),
	MG("Minas Gerais"), 
	PA("para"),
	PB("Paraiba"), 
	PR("Parana"),
	PE("Pernanbuco"), 
	PI("Piaui"),
	RJ("Rio de Janeiro"), 
	RN("Rio Grande do Norte"),
	RS("Rio Grande do Sul"), 
	RO("Rondonia"),
	RR("Roraima"), 
	SC("Santa Catarina"), 
	SP("Sao Paulo"),
	SE("Sergipe"), 
	TO("Tocantins");
	

	private final String name;

	private StateEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
