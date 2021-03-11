package com.ies.poo.douglashiura.teste.jogo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.ies.poo.douglashiura.jogo.Aposta;
import com.ies.poo.douglashiura.jogo.Jogada;
import com.ies.poo.douglashiura.jogo.Jogador;
import com.ies.poo.douglashiura.jogo.JogoParEImpar;
import com.ies.poo.douglashiura.jogo.Numeros;
import com.ies.poo.douglashiura.jogo.ResultadoVencedor;

public class TesteOJogoDoParEImpar {
	private Jogador lucas;
	private Jogador gustavo;
	private Aposta doLucas;
	private Jogada doGustavo;
	private JogoParEImpar parEImpar;

	@Before
	public void configuracao() {
		parEImpar = new JogoParEImpar();
		lucas = new Jogador();
		gustavo = new Jogador("Gustavo");
		lucas.nome = "Lucas";
		lucas.fixarNome("Lucas");
		lucas.fixarNome("Lucas Dias");

		doLucas = new Aposta(lucas, Numeros.IMPAR, 2);
		doGustavo = new Jogada(gustavo, Numeros.PAR, 1);
	}

	@Test
	public void impar() throws Exception {
		parEImpar.adicionarAcao(doLucas);
		parEImpar.adicionarAcao(doGustavo);
		ResultadoVencedor resultado = parEImpar.obterResultado();
		assertEquals(Numeros.IMPAR, resultado.obterResultadoEsperadoVencedor());
		assertEquals(lucas, resultado.obterJogadorVencedor());
		assertNotNull(lucas);
	}

	@Test
	public void par() throws Exception {
		doGustavo = new Jogada(gustavo, Numeros.PAR, 2);
		parEImpar.adicionarAcao(doLucas);
		parEImpar.adicionarAcao(doGustavo);
		ResultadoVencedor resultado = parEImpar.obterResultado();
		assertEquals(Numeros.PAR, resultado.obterResultadoEsperadoVencedor());
		assertEquals(gustavo, resultado.obterJogadorVencedor());
	}

	@Test
	public void comApenasUmaAcao() throws Exception {
		parEImpar.adicionarAcao(doLucas);
		ResultadoVencedor resultado = parEImpar.obterResultado();
		assertNull(resultado);
	}

	@Test
	public void obterResultadoSemAcao() throws Exception {
		ResultadoVencedor resultado = parEImpar.obterResultado();
		assertNull(resultado);
	}
}