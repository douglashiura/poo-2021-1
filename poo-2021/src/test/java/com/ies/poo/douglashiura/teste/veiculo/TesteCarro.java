package com.ies.poo.douglashiura.teste.veiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ies.poo.douglashiura.veiculo.Carro;

public class TesteCarro {

	@Test
	public void criarUmGol() throws Exception {
		Carro gol = new Carro("Gol", 1.8);
		assertEquals(Double.valueOf(1.8), gol.obterPotencia());
	}

	@Test
	public void acelerar() throws Exception {
		Carro fusca = new Carro("Fusca");
		Integer quantidadeDePressaoNoPedal=3;
		assertEquals("BRUM BRUM BRUM", fusca.acelerar(quantidadeDePressaoNoPedal));
	}

}
