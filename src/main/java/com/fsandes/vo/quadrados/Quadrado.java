package com.fsandes.vo.quadrados;

import com.fsandes.enums.Cor;
import com.fsandes.exceptions.LadoNegativo;
import com.fsandes.vo.FormaGeometrica;

public class Quadrado extends FormaGeometrica {
	private Double lado;
	private final String nome = "Quadrado";

	public Quadrado() {

	}

	public Quadrado(Cor cor, Double lado) throws LadoNegativo {
		super(cor);
		if (lado < 0) {
				throw new LadoNegativo();

		}
		this.lado = lado;
	}

	@Override
	public Double calculaArea() {

		return Math.pow(lado,2);
	}

	@Override
	public String getNome() {

		return nome;
	}

	public Double getLado() {

		return lado;
	}

	public void setLado(final Double lado) {

		this.lado = lado;
	}
}
