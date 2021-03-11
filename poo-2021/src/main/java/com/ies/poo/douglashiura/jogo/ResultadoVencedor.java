package com.ies.poo.douglashiura.jogo;

public class ResultadoVencedor {

	private Numeros resultadoEsperadoPeloJogador;
	private Jogador jogadorVencedor;

	public ResultadoVencedor(Numeros resultadoEsperadoPeloJogador, Jogador jogadorVencedor) {
		this.resultadoEsperadoPeloJogador = resultadoEsperadoPeloJogador;
		this.jogadorVencedor = jogadorVencedor;
	}

	public Object obterResultadoEsperadoVencedor() {
		return resultadoEsperadoPeloJogador;
	}

	public Object obterJogadorVencedor() {
		return jogadorVencedor;
	}

}
