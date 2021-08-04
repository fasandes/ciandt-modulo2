package com.fsandes.vo;

import com.fsandes.exceptions.SalarioNegativo;

public class AnalistaQualidade  implements Funcionario, Assalariado{

	@Override
	public Double recebeSalario(final Double salario) {
		if (salario <= 0) {
			throw new SalarioNegativo();
		}
		return salario;
	}

	@Override
	public void trabalha() {
		System.out.println("O QA pegou um bug.");
	}
}
