package com.fsandes.vo;

import com.fsandes.enums.Cor;

public class Quadrado extends FormaGeometrica {
	private Double lado;
	private final String nome = "Quadrado";

	public Quadrado(Cor cor, Double lado){
		super(cor);
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
}
