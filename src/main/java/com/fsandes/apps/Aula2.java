package com.fsandes.apps;

import java.util.ArrayList;
import java.util.List;

import com.fsandes.vo.AnalistaQualidade;
import com.fsandes.vo.Assalariado;
import com.fsandes.vo.CargoDeConfianca;
import com.fsandes.vo.Estagiario;
import com.fsandes.vo.Funcionario;
import com.fsandes.vo.Gerente;
import com.fsandes.vo.Programador;

public class Aula2 implements Executavel {

	@Override
	public void executar() {
		//TODO - criar uma lista com todos os funcionarios
		//TODO - criar uma lista com todos assalariados
		// TODO - imprimir o salário dinâmicamente.

		List<Funcionario> listaFuncionarios = new ArrayList<>();
		List<Assalariado> listaAssalariado = new ArrayList<>();
		List<CargoDeConfianca> listaCargoDeConfianca = new ArrayList<>();

		Gerente gerente = new Gerente();
		listaCargoDeConfianca.add(gerente);
		listaFuncionarios.add(gerente);

		Estagiario estagiario = new Estagiario();
		listaFuncionarios.add(estagiario);

		AnalistaQualidade analista = new AnalistaQualidade();
		listaFuncionarios.add(analista);
		listaAssalariado.add(analista);
		//        listaCargoDeConfianca.add(analista);

		Programador programador = new Programador();
		listaFuncionarios.add(programador);
		listaAssalariado.add(programador);

		listaFuncionarios.get(0).trabalha();
	}
}
