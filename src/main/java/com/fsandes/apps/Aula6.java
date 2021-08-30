package com.fsandes.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.fsandes.enums.Cor;
import com.fsandes.vo.AnalistaQualidade;
import com.fsandes.vo.Gerente;
import com.fsandes.vo.Programador;
import com.fsandes.vo.Triangulo;
import com.fsandes.vo.quadrados.Quadrado;

public class Aula6 implements Executavel {

	/*
	Fábrica de telhados:
	Precisamos criar um fluxo de trabalho para criar um telhado.
	Para criar cada telhado, temos que criar um quadrado e 2 triangulos.

	O Cliente solicitou 1.000 telhados.

	Objetivo, mostrar o comportamento single e multi thread
	 */
	@Override
	public void executar() {

		ExecutorService executorService = Executors.newFixedThreadPool(1000);

		Future<List<Quadrado>> futureQuadradoList = executorService.submit(() -> criaQuadrados(100));
		Future<List<Triangulo>> futureTrianguloList = executorService.submit(() -> criaTriangulos(200));

		List<Quadrado> quadradoList = null;
		List<Triangulo> trianguloList = null;

		try {
			//task que demora mais tempo
			trianguloList = futureTrianguloList.get();
			//tempo que for necessário - se há tempo máximo (?) - na nossa applicação que é um MS, ele vai retornar timeout pelo http
			System.out.println("Triangulo list possui : " + trianguloList.size());

			System.out.println("Future quadrado is done? " + futureQuadradoList.isDone());
			System.out.println("Future Triangulo is done? " + futureTrianguloList.isDone());
			quadradoList = futureQuadradoList.get();
			System.out.println("Future quadrado is done? " + futureQuadradoList.isDone());
			System.out.println("Future Triangulo is done? " + futureTrianguloList.isDone());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		//Eu não consigo montar um telhado sem antes ter montado triangulos e quadrados

		//for que vai de 0 a 1.000.
		for (int i = 0; i < quadradoList.size(); i++) {
			trianguloList.size();

			Triangulo triangulo1 = trianguloList.remove(0);
			Triangulo triangulo2 = trianguloList.remove(0);
			Quadrado quadrado = quadradoList.get(i);

			//zé que monta, está executando
			montaTelhado(triangulo1, triangulo2, quadrado, i);
		}
	}

	//Montar 1000 quadrados e gastar tempo lado 5
	private List<Quadrado> criaQuadrados(final int quantidade) {

		final List<Quadrado> quadradoList = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {

			Quadrado quadrado = new Quadrado(Cor.BLUE, 5D);
			gastaTempo();
			quadradoList.add(quadrado);
//			System.out.println("Criou quadrado " + (i + 1));
		}

		return quadradoList;
	}


	// montar triangulo, inserir no trianguloList gastar tempo 2.5 base 2.5 altura
	private List<Triangulo> criaTriangulos(final int quantidade) {
final List<Triangulo> trianguloList = new ArrayList<>();
		for (int i = 0; i< quantidade; i++) {
			Triangulo triangulo = new Triangulo(Cor.BLUE, 2.5, 2.5);
			gastaTempo();
			trianguloList.add(triangulo);
//			System.out.println("Criou triangulo " + (i + 1));

		}

		return trianguloList;
	}

	private void montaTelhado(final Triangulo triangulo1, final Triangulo triangulo2, final Quadrado quadrado, final int indice) {
		System.out.println("telhados " + (indice + 1) + " criados");

	}


	private void gastaTempo() {
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}

}
