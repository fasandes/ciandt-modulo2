package com.fsandes.vo;

public class Gerente implements Funcionario, CargoDeConfianca, Assalariado {

	@Override
	public void demitirFuncionario(final String nome) {

		System.out.println("o gerente demite o: " + nome);

	}

	@Override
	public void trabalha() {

		System.out.println("O gerente 'Trabalha' muito ");

	}

	@Override
	public Double recebeSalario(final Double salario) {

		return salario;
	}
}
