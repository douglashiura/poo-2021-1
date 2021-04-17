package com.ies.poo.douglashiura.jogo;

public class Acao {
	public Jogador jogador;
	public Numeros resultadoEsperadoPeloJogador;
	private Integer entrada;

	public Acao(Jogador jogador, Numeros resultadoEsperadoPeloJogador, Integer entrada) {
		this.jogador = jogador;
		this.resultadoEsperadoPeloJogador = resultadoEsperadoPeloJogador;
		this.entrada = entrada;
	}

	public Integer obterEntrada() {
		return entrada;
	}

}
