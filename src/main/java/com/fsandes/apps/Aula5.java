package com.fsandes.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.fsandes.enums.Cor;
import com.fsandes.vo.Triangulo;
import com.fsandes.vo.quadrados.Quadrado;

public class Aula5 implements Executavel {

	/*
	Fábrica de telhados:
	Precisamos criar um fluxo de trabalho para criar um telhado.
	Para criar cada telhado, temos que criar um quadrado e 2 triangulos.

	O Cliente solicitou 1.000 telhados.

	Objetivo, mostrar o comportamento single e multi thread
	 */
	@Override
	public void executar() {

		final List<Quadrado> quadradoList = new ArrayList<>();
		final List<Triangulo> trianguloList = new ArrayList<>();

		
		Thread threadQuadrados = new Thread(() -> 		criaQuadrados(quadradoList, 1_000));
		Thread threadTriangulos = new Thread(() -> 		criaTriangulos(trianguloList, 2_000));

		System.out.println("inicia tarefa quadrados");
		//nova task - ou tarefa, ou em paralelo
		threadQuadrados.start();
		//nova task - ou tarefa, ou em paralelo
		System.out.println("inicia tarefa triangulos");
		threadTriangulos.start();

		try {
			//esperar a tarefa terminar e voltar para o nosso "caminho" usando "join"
			threadQuadrados.join();
			threadTriangulos.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		criaQuadrados(quadradoList, 1_000);
//		criaTriangulos(trianguloList, 2_000);


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
	private List<Quadrado> criaQuadrados(final List<Quadrado> quadradoList, final int quantidade) {

		for (int i = 0; i < quantidade; i++) {

			Quadrado quadrado = new Quadrado(Cor.BLUE, 5D);
			gastaTempo();
			quadradoList.add(quadrado);
			System.out.println("Criou quadrado " + (i + 1));
		}

		return quadradoList;
	}


	// montar triangulo, inserir no trianguloList gastar tempo 2.5 base 2.5 altura
	private List<Triangulo> criaTriangulos(List<Triangulo> trianguloList, final int quantidade) {

		for (int i = 0; i< quantidade; i++) {
			Triangulo triangulo = new Triangulo(Cor.BLUE, 2.5, 2.5);
			gastaTempo();
			trianguloList.add(triangulo);
			System.out.println("Criou triangulo " + (i + 1));

		}

		return trianguloList;
	}

	private void montaTelhado(final Triangulo triangulo1, final Triangulo triangulo2, final Quadrado quadrado, final int indice) {
		System.out.println("telhados " + (indice + 1) + " criados");

	}


	private void gastaTempo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
