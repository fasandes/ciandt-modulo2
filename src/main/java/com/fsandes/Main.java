package com.fsandes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fsandes.apps.Aula1;
import com.fsandes.apps.Aula2;
import com.fsandes.apps.Aula4;
import com.fsandes.apps.Executavel;
import com.fsandes.enums.Cor;
import com.fsandes.vo.FormaGeometrica;
import com.fsandes.vo.quadrados.Quadrado;

public class Main {

	public static void main(String[] args) {

		List<Executavel> executaveis = new ArrayList<>();

		Map<Executavel, String> map = new HashMap<>();
		Aula1 aula1 = new Aula1();


		List<? extends FormaGeometrica> formasExtends = new ArrayList<>();
		List<? super FormaGeometrica> formasSuper = new ArrayList<>();
		formasSuper.add(new Quadrado());

		map.put(aula1, "Aula de classe abastrata");
		map.put(new Aula1(), "Aula de classe abastrata");


		System.out.println(map.get(aula1));

		executaveis.add(new Aula1());
		executaveis.add(new Aula2());
		executaveis.add(new Aula4());
		executaveis.add(new Aula4());
		executaveis.add(new Quadrado());
//		executaveis.add(new Aula5());

		for (Executavel exec : executaveis) {
			exec.executar();
		}

	}

}
