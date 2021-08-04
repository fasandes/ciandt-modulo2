package com.fsandes.vo;

public class Programador implements Funcionario, Assalariado {

	@Override
	public Double recebeSalario(final Double salario) {


		return salario;
	}

	@Override
	public void trabalha() {

		System.out.println("O programador trabalha na CI&T");
	}
}
