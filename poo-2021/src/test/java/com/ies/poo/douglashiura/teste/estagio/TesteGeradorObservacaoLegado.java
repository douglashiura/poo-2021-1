package com.ies.poo.douglashiura.teste.estagio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.ies.poo.douglashiura.teste.estagio.codigo.GeradorObservacao;
import com.ies.poo.douglashiura.teste.estagio.codigo.Nota;

public class TesteGeradorObservacaoLegado {
	private GeradorObservacao gerador;

	@Before
	public void setUp() {
		gerador = new GeradorObservacao();

	}

	@Test
	public void vazia() throws Exception {
		assertEquals("", gerador.geraObservacao(Collections.EMPTY_LIST));
	}

	@Test
	public void uma() throws Exception {
		assertEquals("Fatura da nota fiscal de simples remessa: 1.", gerador.geraObservacao(Arrays.asList(1)));
	}

	@Test
	public void duas() throws Exception {
		assertEquals("Fatura das notas fiscais de simples remessa: 1 e 2.",
				gerador.geraObservacao(Arrays.asList(1, 2)));
	}

	@Test
	public void tres() throws Exception {
		assertEquals("Fatura das notas fiscais de simples remessa: 1, 2 e 3.",
				gerador.geraObservacao(Arrays.asList(1, 2, 3)));
	}

	@Test(expected = RuntimeException.class)
	public void nullos() throws Exception {
		gerador.geraObservacao(Arrays.asList(null));
	}

	@Test(expected = RuntimeException.class)
	public void nulla() throws Exception {
		gerador.geraObservacao(null);
	}

	@Test
	public void umaNotaPeloLegado() throws Exception {
		assertEquals("Fatura da nota fiscal de simples remessa: 1 cujo valor é R$33.33.",
				gerador.geraObservacao(Arrays.asList(new Nota(1, 33.33f))));
	}

}
