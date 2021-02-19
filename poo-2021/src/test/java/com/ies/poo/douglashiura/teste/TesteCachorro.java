package com.ies.poo.douglashiura.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ies.poo.douglashiura.animal.Cachorro;

public class TesteCachorro {

	@Test
	public void toby() throws Exception {
		Cachorro toby = new Cachorro("Toby");
		assertEquals("Toby", toby.obterNome());
	}

	@Test
	public void oLatirDoToby() throws Exception {
		Cachorro toby = new Cachorro("Toby");
		assertEquals("Au Au!", toby.latir());
	}

}
