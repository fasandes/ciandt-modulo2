package com.fsandes.exceptions;

public class SalarioNegativo extends RuntimeException{


	public SalarioNegativo() {
		super("Salario negativo");
	}
}
