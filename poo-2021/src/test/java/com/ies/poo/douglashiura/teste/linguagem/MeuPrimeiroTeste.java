package com.ies.poo.douglashiura.teste.linguagem;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeuPrimeiroTeste {

	@Test
	public void comUmaVariavel() throws Exception {
		Object contador = 1;
		assertEquals(1, contador);
	}
	

	@Test
	public void oProprioNome() throws Exception {
		
		Object meuNome = "Douglas Hiura Longo";
		
		assertEquals("Douglas Hiura Longo", meuNome);
	}

}
