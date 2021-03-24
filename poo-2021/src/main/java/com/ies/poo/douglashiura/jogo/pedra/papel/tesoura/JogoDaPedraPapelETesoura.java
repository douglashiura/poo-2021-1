package com.ies.poo.douglashiura.jogo.pedra.papel.tesoura;

import java.util.ArrayList;
import java.util.List;

public class JogoDaPedraPapelETesoura {

	private OpcoesDoJogo opcaoVencedora;
	private List<Regra> regras;

	public JogoDaPedraPapelETesoura(JogadaDoPedraPapelTesoura aposta, JogadaDoPedraPapelTesoura contraAposta) {
		adicionaRegras();
		verificaARegraVencedora(aposta, contraAposta);
	}

	private void adicionaRegras() {
		Regra pedraTesoura = new Regra(OpcoesDoJogo.PEDRA, OpcoesDoJogo.TESOURA, OpcoesDoJogo.PEDRA);
		Regra pedraPapel = new Regra(OpcoesDoJogo.PEDRA, OpcoesDoJogo.PAPEL, OpcoesDoJogo.PAPEL);
		regras = new ArrayList<Regra>();
		regras.add(pedraTesoura);
		regras.add(pedraPapel);
	}

	private void verificaARegraVencedora(JogadaDoPedraPapelTesoura aposta, JogadaDoPedraPapelTesoura contraAposta) {
		for (Regra regra : regras) {
			if (regra.ehRegraQueSeEncaixa(aposta.obterOpcao(), contraAposta.obterOpcao())) {
				opcaoVencedora = regra.obterVencedor();
			}
		}
	}

	public OpcoesDoJogo obterAOpcaoVencedora() {
		return opcaoVencedora;
	}

}
