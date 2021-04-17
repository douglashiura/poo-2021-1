package com.ies.poo.douglashiura.jogo.pedra.papel.tesoura;

public class Regra {

	private OpcoesDoJogo vencedor;
	private OpcoesDoJogo contraAposta;
	private OpcoesDoJogo aposta;

	public Regra(OpcoesDoJogo aposta, OpcoesDoJogo contraAposta, OpcoesDoJogo vencedor) {
		this.aposta = aposta;
		this.contraAposta = contraAposta;
		this.vencedor = vencedor;
	}

	public OpcoesDoJogo obterVencedor() {
		return vencedor;
	}

	public Boolean ehRegraQueSeEncaixa(OpcoesDoJogo aposta, OpcoesDoJogo contraAposta) {
		return this.aposta == aposta && this.contraAposta == contraAposta;
	}

}
