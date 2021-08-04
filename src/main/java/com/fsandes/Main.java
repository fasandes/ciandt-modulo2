package com.fsandes;

import java.util.ArrayList;
import java.util.List;

import com.fsandes.apps.Aula1;
import com.fsandes.apps.Aula2;
import com.fsandes.apps.Aula4;
import com.fsandes.apps.Executavel;

public class Main {

	public static void main(String[] args) {

		List<Executavel> executaveis = new ArrayList<>();
//		executaveis.add(new Aula1());
//		executaveis.add(new Aula2());
		executaveis.add(new Aula4());

		for (Executavel exec : executaveis) {
			exec.executar();
		}

	}

}
