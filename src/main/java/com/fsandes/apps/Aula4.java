package com.fsandes.apps;

import java.io.IOException;
import java.net.URISyntaxException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fsandes.enums.Cor;
import com.fsandes.services.FileReaderService;
import com.fsandes.vo.quadrados.Quadrado;

public class Aula4 implements Executavel {

	private ObjectMapper objectMapper;

	public Aula4() {
		objectMapper = new ObjectMapper();
	}

	@Override
	public void executar() {
		// objectMapper.readValue para deserializar
		//objectMapper.writeValueAsString para serializar
		//Precisamos recuerar deserializar o dado no json "quadrado.json"
		// 1 - há um método da classe FileReaderService que lê este dado e transforma em string.
//criar um método que me retorno um quadrado com o valor do json
		//dica terei que usar o string do json e o object mapper
		Quadrado quadrado = getSquare("quadrado.json");

		System.out.println(" A area é : " + quadrado.calculaArea());
		System.out.println(" O lado é : " + quadrado.getLado());
		System.out.println(" A cor é : " + quadrado.getCor());
		System.out.println(" O nome é : " + quadrado.getNome());

		// atualizar o valor do lado para 5.00
		//Atualizar a cor para Azul
		//salvar o quadrado quadrado, chamado-o de quadrado2.json
		quadrado.setLado(5.00);
		quadrado.setCor(Cor.BLUE);
		System.out.println(" A area é : " + quadrado.calculaArea());
		System.out.println(" O lado é : " + quadrado.getLado());
		System.out.println(" A cor é : " + quadrado.getCor());
		System.out.println(" O nome é : " + quadrado.getNome());
		int i = 1;
		salvarQuadrado(quadrado, "quadrado"+i+".json");


	}

	private Quadrado getSquare(String nomeArquivo) {
		String valorEmString = recuperaODadoEmString(nomeArquivo);
		Quadrado quadrado = null;
		try {
			quadrado = objectMapper.readValue(valorEmString, Quadrado.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return quadrado;
	}

	private String recuperaODadoEmString(String nomeDoArquivo) {
		String valorEmString = null;
		try {
			valorEmString =  FileReaderService.ler(nomeDoArquivo);
		} catch (URISyntaxException e) {
			System.out.println("erro ocorreu");
		} catch (IOException e) {
			System.out.println("erro ocorreu");
		}
		//tenho que pensar que o retorno do método, recuperaODadoEmString pode retornar null.
		return valorEmString;
	}

	private void salvarQuadrado(Quadrado quadrado, String nomeArquivo) {
		String valorDoObjeto = null;
		try {
			valorDoObjeto = objectMapper.writeValueAsString(quadrado);
			FileReaderService.gravar(nomeArquivo, valorDoObjeto);

		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
	}
}
