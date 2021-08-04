package com.fsandes.apps;

import java.io.IOException;
import java.net.URISyntaxException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fsandes.services.FileReaderService;
import com.fsandes.vo.quadrados.Quadrado;

public class Aula4 implements Executavel{

	@Override
	public void executar() {


		// objectMapper.readValue para deserializar
		//objectMapper.writeValueAsString para serializar
		ObjectMapper objectMapper = new ObjectMapper();

	}
}
