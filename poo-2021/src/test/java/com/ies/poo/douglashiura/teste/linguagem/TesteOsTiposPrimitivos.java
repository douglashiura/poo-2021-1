package com.ies.poo.douglashiura.teste.linguagem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteOsTiposPrimitivos {

	@Test
	public void umBoolean() throws Exception {
		boolean umBoolean = true;
		assertEquals(true, umBoolean);
	}

	@Test
	public void umShort() throws Exception {
		short umShort = 10;
		assertEquals(10, umShort);
	}

	@Test
	public void umChar() throws Exception {
		char umChar = 'a';
		assertEquals('a', umChar);
	}
	

	@Test
	public void umFloat() throws Exception {
		Float umFloat = 10.2f;
		assertEquals(Float.valueOf(10.2f), umFloat);
	}

}
