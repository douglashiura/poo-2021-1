package com.ies.poo.douglashiura.jogo.pedra.papel.tesoura;

import com.ies.poo.douglashiura.jogo.Jogador;

public class JogadaDoPedraPapelTesoura {

	private OpcoesDoJogo opcao;

	public JogadaDoPedraPapelTesoura(Jogador jogador, OpcoesDoJogo opcao) {
		this.opcao = opcao;
	}

	public OpcoesDoJogo obterOpcao() {
		return opcao;
	}

}
