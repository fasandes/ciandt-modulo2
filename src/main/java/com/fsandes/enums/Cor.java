package com.fsandes.enums;

public enum Cor {
	
	RED("FF0000"),
	GREEN("00FF00"),
	BLUE("0000FF");

	public String hexadecimal;

	Cor(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}



}
