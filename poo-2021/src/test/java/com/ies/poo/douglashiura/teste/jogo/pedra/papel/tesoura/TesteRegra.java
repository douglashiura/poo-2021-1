package com.ies.poo.douglashiura.teste.jogo.pedra.papel.tesoura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ies.poo.douglashiura.jogo.pedra.papel.tesoura.OpcoesDoJogo;
import com.ies.poo.douglashiura.jogo.pedra.papel.tesoura.Regra;

public class TesteRegra {

	@Test
	public void pedraTesoura() {
		Regra pedraTesoura = new Regra(OpcoesDoJogo.PEDRA, OpcoesDoJogo.TESOURA, OpcoesDoJogo.PEDRA);
		assertEquals(OpcoesDoJogo.PEDRA, pedraTesoura.obterVencedor());
	}

	@Test
	public void ehUmaRegraQueSeEncaixa() {
		Regra pedraTesoura = new Regra(OpcoesDoJogo.PEDRA, OpcoesDoJogo.TESOURA, OpcoesDoJogo.PEDRA);
		assertTrue(pedraTesoura.ehRegraQueSeEncaixa(OpcoesDoJogo.PEDRA, OpcoesDoJogo.TESOURA));
		assertFalse(pedraTesoura.ehRegraQueSeEncaixa(OpcoesDoJogo.PEDRA, OpcoesDoJogo.PAPEL));
		assertFalse(pedraTesoura.ehRegraQueSeEncaixa(OpcoesDoJogo.TESOURA, OpcoesDoJogo.TESOURA));
	}

	@Test
	public void tesouraPedra() {
		Regra tesouraPedra = new Regra(OpcoesDoJogo.TESOURA, OpcoesDoJogo.PEDRA, OpcoesDoJogo.PEDRA);
		assertEquals(OpcoesDoJogo.PEDRA, tesouraPedra.obterVencedor());
	}

	@Test
	public void pedraPapel() throws Exception {
		Regra pedraPapel = new Regra(OpcoesDoJogo.PEDRA, OpcoesDoJogo.PAPEL, OpcoesDoJogo.PAPEL);
		assertEquals(OpcoesDoJogo.PAPEL, pedraPapel.obterVencedor());

	}
}
