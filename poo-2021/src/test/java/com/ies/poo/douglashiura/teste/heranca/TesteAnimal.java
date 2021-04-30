package com.ies.poo.douglashiura.teste.heranca;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TesteAnimal {
	@Test
	public void tipoFuncionario() throws Exception {
		Animal animal = new Animal();
		assertNotNull(animal);
	}

	@Test
	public void subTipo() throws Exception {
		Peixe taina = new Peixe();
		assertFalse(taina.ehNadador());
	}
}
