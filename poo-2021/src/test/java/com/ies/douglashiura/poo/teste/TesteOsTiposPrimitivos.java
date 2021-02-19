package com.ies.douglashiura.poo.teste;

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
		short umShort = 10000;
		assertEquals(10, umShort);
	}

	@Test
	public void umChar() throws Exception {
		char umChar = 'a';
		assertEquals('a', umChar);
	}
	

	@Test
	public void umFloat() throws Exception {
		Float umFloat = 10000000000000.20000f;
		assertEquals(Float.valueOf(10.2f), umFloat);
	}

}
