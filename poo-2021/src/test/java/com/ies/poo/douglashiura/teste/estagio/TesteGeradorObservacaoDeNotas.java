package com.ies.poo.douglashiura.teste.estagio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.ies.poo.douglashiura.teste.estagio.codigo.GeradorObservacao;
import com.ies.poo.douglashiura.teste.estagio.codigo.Nota;

public class TesteGeradorObservacaoDeNotas {

	private Nota notaDe10;
	private Nota notaDe20;
	private Nota notaDe30;
	private GeradorObservacao gerador;

	@Before
	public void setUp() {
		notaDe10 = new Nota(1, 10.0f);
		notaDe20 = new Nota(2, 25.0f);
		notaDe30 = new Nota(3, 3333.33f);
		gerador = new GeradorObservacao();
	}

	@Test
	public void vaziaDeNotas() throws Exception {
		assertEquals("", gerador.geraObservacaoDeNotas(Collections.emptyList()));
	}

	@Test
	public void umaNota() throws Exception {
		assertEquals("Fatura da nota fiscal de simples remessa: 1 cujo valor é R$10.00.",
				gerador.geraObservacaoDeNotas(Arrays.asList(notaDe10)));
	}

	@Test(expected = RuntimeException.class)
	public void nulla() throws Exception {
		gerador.geraObservacaoDeNotas(null);
	}

	@Test(expected = RuntimeException.class)
	public void notaNulla() throws Exception {
		gerador.geraObservacaoDeNotas(Arrays.asList((Nota) null));
	}

	@Test(expected = RuntimeException.class)
	public void notaDeValorNulo() throws Exception {
		gerador.geraObservacaoDeNotas(Arrays.asList(new Nota(1, null)));
	}

	@Test(expected = RuntimeException.class)
	public void notaDeCodigoNulo() throws Exception {
		gerador.geraObservacaoDeNotas(Arrays.asList(new Nota(null, 10.3f)));
	}

	@Test
	public void duasNotas() throws Exception {
		assertEquals("Fatura das notas fiscais de simples remessa: 1 cujo valor é R$10.00 e 2 cujo valor é R$25.00. Total = R$35.00.",
				gerador.geraObservacaoDeNotas(Arrays.asList(notaDe10, notaDe20)));
	}

	@Test
	public void tresNotas() throws Exception {
		assertEquals(
				"Fatura das notas fiscais de simples remessa: 1 cujo valor é R$10.00, 2 cujo valor é R$25.00 e 3 cujo valor é R$3,333.33. Total = R$3,368.33.",
				gerador.geraObservacaoDeNotas(Arrays.asList(notaDe10, notaDe20, notaDe30)));
	}

}
