package com.fsandes.vo.usuario;


//dados do usuário no banco de dados - pode ser um objeto json

/*ususario :
{
"nome" : "Fabrício",
"endereco" : "rua lalala",
"id" : 1
}

*/

import java.io.Serializable;

public class Usuario implements Serializable {

	String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
	private String nome;
	private String endereco;
	private Integer id;

	public String getNome() {

		return nome;
	}

	public void setNome(final String nome) {

		this.nome = nome;
	}

	public String getEndereco() {

		return endereco;
	}

	public void setEndereco(final String endereco) {

		this.endereco = endereco;
	}

	public Integer getId() {

		return id;
	}

	public void setId(final Integer id) {

		this.id = id;
	}
}
