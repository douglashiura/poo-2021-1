package com.ies.poo.douglashiura.teste.thread;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ies.poo.douglashiura.jogo.Acao;
import com.ies.poo.douglashiura.jogo.Aposta;
import com.ies.poo.douglashiura.jogo.Jogada;
import com.ies.poo.douglashiura.jogo.Jogador;
import com.ies.poo.douglashiura.jogo.JogoParEImpar;
import com.ies.poo.douglashiura.jogo.Numeros;
import com.ies.poo.douglashiura.jogo.ResultadoVencedor;

public class TesteJogadasEmParaleloObtendoOResultado {
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
	public void paralelismoNasJogadas() throws Exception {
		Thread lucasEmParalelo = new Thread(new FazJogada(doLucas));
		Thread gustavoEmParalelo = new Thread(new FazJogada(doGustavo));
		lucasEmParalelo.start();
		gustavoEmParalelo.start();
		ResultadoVencedor resultado = parEImpar.obterResultado();
		assertEquals(Numeros.IMPAR, resultado.obterResultadoVencedor());
		lucasEmParalelo.join();
		gustavoEmParalelo.join();
	}

	@Test
	public void paralelismoNoResultado() throws Exception {
		Thread assercaoDeResultado = new Thread(new AsseguraResultadoImpar());
		Thread lucasEmParalelo = new Thread(new FazJogada(doLucas));
		Thread gustavoEmParalelo = new Thread(new FazJogada(doGustavo));
		assercaoDeResultado.start();
		lucasEmParalelo.start();
		gustavoEmParalelo.start();
		lucasEmParalelo.join();
		gustavoEmParalelo.join();
		assercaoDeResultado.join();
	}

	class AsseguraResultadoImpar implements Runnable {

		@Override
		public void run() {
			ResultadoVencedor resultado = parEImpar.obterResultado();
			assertEquals(Numeros.IMPAR, resultado.obterResultadoVencedor());

		}

	}

	class FazJogada implements Runnable {
		private Acao acao;

		public FazJogada(Acao acao) {
			this.acao = acao;
		}

		@Override
		public void run() {
			parEImpar.adicionarAcao(acao);
		}
	}

}
