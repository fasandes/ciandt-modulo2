package com.fsandes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fsandes.apps.Aula1;
import com.fsandes.apps.Aula2;
import com.fsandes.apps.Aula4;
import com.fsandes.apps.Aula5;
import com.fsandes.apps.Executavel;
import com.fsandes.enums.Cor;
import com.fsandes.vo.FormaGeometrica;
import com.fsandes.vo.quadrados.Quadrado;

public class Main {

	public static void main(String[] args) {

		List<Executavel> executaveis = new ArrayList<>();


//		executaveis.add(new Aula1());
//		executaveis.add(new Aula2());
//		executaveis.add(new Aula4());
//		executaveis.add(new Aula4());
		long startTime = System.nanoTime();

		executaveis.add(new Aula5());

		for (Executavel exec : executaveis) {
			exec.executar();
		}

		long endTime = System.nanoTime();

		long duration = (endTime - startTime) / 1_000_000;
		System.out.println("Execução em: " + duration);
	}

}
