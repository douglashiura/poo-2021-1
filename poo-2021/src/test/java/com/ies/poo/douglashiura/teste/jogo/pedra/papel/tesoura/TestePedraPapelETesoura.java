package com.ies.poo.douglashiura.teste.jogo.pedra.papel.tesoura;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ies.poo.douglashiura.jogo.Jogador;
import com.ies.poo.douglashiura.jogo.pedra.papel.tesoura.JogadaDoPedraPapelTesoura;
import com.ies.poo.douglashiura.jogo.pedra.papel.tesoura.JogoDaPedraPapelETesoura;
import com.ies.poo.douglashiura.jogo.pedra.papel.tesoura.OpcoesDoJogo;

public class TestePedraPapelETesoura {

	@Test
	public void venceAPedra() throws Exception {
		Jogador nilo = new Jogador("Nilo");
		Jogador anatan = new Jogador("Anatan");
		JogadaDoPedraPapelTesoura jogadaDoAnatan = new JogadaDoPedraPapelTesoura(anatan, OpcoesDoJogo.PEDRA);
		JogadaDoPedraPapelTesoura jogadaDoNilo = new JogadaDoPedraPapelTesoura(nilo, OpcoesDoJogo.TESOURA);
		JogoDaPedraPapelETesoura jogo = new JogoDaPedraPapelETesoura(jogadaDoAnatan, jogadaDoNilo);
		OpcoesDoJogo vencedora = jogo.obterAOpcaoVencedora();
		assertEquals(OpcoesDoJogo.PEDRA, vencedora);
	}

	@Test
	public void venceOPapel() throws Exception {
		Jogador nilo = new Jogador("Nilo");
		Jogador anatan = new Jogador("Anatan");
		JogadaDoPedraPapelTesoura jogadaDoAnatan = new JogadaDoPedraPapelTesoura(anatan, OpcoesDoJogo.PEDRA);
		JogadaDoPedraPapelTesoura jogadaDoNilo = new JogadaDoPedraPapelTesoura(nilo, OpcoesDoJogo.PAPEL);
		JogoDaPedraPapelETesoura jogo = new JogoDaPedraPapelETesoura(jogadaDoAnatan, jogadaDoNilo);
		OpcoesDoJogo vencedora = jogo.obterAOpcaoVencedora();
		assertEquals(OpcoesDoJogo.PAPEL, vencedora);
	}

}
