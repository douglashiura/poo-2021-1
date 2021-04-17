package com.ies.poo.douglashiura.teste.banco.de.dados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class TesteAConexaoComOBancoDeDados {

	@Test
	public void conexao() throws Exception {
		Pessoa douglas = new Pessoa();
		douglas.setNome("Douglas via JDBC");
		ConexaoComOBancoDeDados conexao = new ConexaoComOBancoDeDados();
		conexao.persistir(douglas);
		assertNotNull(douglas.getId());
	}

	@Test
	public void selecionarPessoaDoBanco() throws Exception {
		ConexaoComOBancoDeDados conexao = new ConexaoComOBancoDeDados();
		conexao.limparPessoasDoBanco();
		Pessoa douglas = new Pessoa();
		douglas.setIdade(29);
		douglas.setNome("Douglas via JDBC");
		Pessoa joao = new Pessoa();
		joao.setNome("Joao via JDBC");

		conexao.persistir(douglas);
		conexao.persistir(joao);

		List<Pessoa> pessoas = conexao.lista();
		assertEquals(2, pessoas.size());
		assertEquals(29, pessoas.get(0).getIdade().intValue());

	}

}
