package com.fsandes.vo;

import com.fsandes.enums.Cor;
import com.fsandes.vo.quadrados.Quadrado;

public class Triangulo extends FormaGeometrica {
	private Double base;
	private Double altura;
	private final String nome = "Triangulo";

	public Triangulo(final Cor cor, Double base, Double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

//	public float getArea() {
//		return (base * altura) / 2;
//	}

	public Double calculaArea(){
		return (base * altura) / 2;
	}

	public String getNome(){
		return nome;
	}

}
