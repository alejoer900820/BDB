package com.valid.util;

public enum EnumMessages {
	
	OK("Respuesta correcta"),
	ERROR("Respuesta incorrecta")
	;
	
	private String name;

	private EnumMessages(String namme) {
		this.name = namme;
	}

	public String getName() {
		return name;
	}
	
}
