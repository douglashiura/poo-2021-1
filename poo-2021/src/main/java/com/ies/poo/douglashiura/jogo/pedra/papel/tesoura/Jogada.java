package com.ies.poo.douglashiura.jogo.pedra.papel.tesoura;

import com.ies.poo.douglashiura.jogo.Jogador;

public class Jogada {

	private OpcoesDoJogo opcao;

	public Jogada(Jogador jogador, OpcoesDoJogo opcao) {
		this.opcao = opcao;
	}

	public OpcoesDoJogo obterOpcao() {
		return opcao;
	}

}
