package com.fsandes.vo;

import com.fsandes.enums.Cor;

//o que é uma figura geometrica
public abstract class FormaGeometrica  {

	private Cor cor;

	public FormaGeometrica() {

	}

	public FormaGeometrica(final Cor cor) {
		String a = cor.hexadecimal;
		String b = Cor.BLUE.hexadecimal;

		this.cor = cor;
	}


	public Cor getCor() {

		return cor;
	}

	public void setCor(final Cor cor) {

		this.cor = cor;
	}

	public abstract Double calculaArea();

	public abstract String getNome();



}
