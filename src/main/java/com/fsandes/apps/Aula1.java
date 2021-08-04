package com.fsandes.apps;

import java.util.ArrayList;
import java.util.List;

import com.fsandes.enums.Cor;
import com.fsandes.exceptions.LadoNegativo;
import com.fsandes.vo.FormaGeometrica;
import com.fsandes.vo.Triangulo;
import com.fsandes.vo.quadrados.Quadrado;

public class Aula1 implements Executavel{

	@Override
	public void executar() {
		Quadrado quadrado = null;
		try {
			quadrado = new Quadrado(Cor.RED,5d);
		} catch (LadoNegativo ladoNegativo) {
			ladoNegativo.printStackTrace();
		}
		Triangulo triangulo = new Triangulo(Cor.GREEN, 5d, 2d);

		List<FormaGeometrica> formaGeometricaList = new ArrayList<>();
		formaGeometricaList.add(quadrado);
		formaGeometricaList.add(triangulo);

		//TODO - Instanciar todas as figuras em um Lista, e imprimir, para cada item, cor, área e perimetro.

		for (FormaGeometrica formaGeometrica: formaGeometricaList) {
			System.out.println("A Figura é: " + formaGeometrica.getNome());
			System.out.println("A Cor é: " + formaGeometrica.getCor());
			System.out.println("A Area é: " + formaGeometrica.calculaArea());
		}

		//TODO - Criar uma "estrutura" para novas figuras.
		//TODO - Criar método para perímetro

	}


}
