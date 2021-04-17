package com.ies.poo.douglashiura.teste.jogo.pedra.papel.tesoura;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ies.poo.douglashiura.jogo.pedra.papel.tesoura.OpcoesDoJogo;

public class TesteOpcoesDoJogo {

	@Test
	public void opcoesDoJogo() throws Exception {
		OpcoesDoJogo[] opcoes = OpcoesDoJogo.values();
		assertEquals(3, opcoes.length);
		assertEquals(OpcoesDoJogo.PEDRA, opcoes[0]);
		assertEquals(OpcoesDoJogo.PAPEL, opcoes[1]);
		assertEquals(OpcoesDoJogo.TESOURA, opcoes[2]);
	}

}
