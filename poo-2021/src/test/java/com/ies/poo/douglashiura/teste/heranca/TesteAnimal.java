package com.ies.poo.douglashiura.teste.heranca;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ies.poo.douglashiura.Funcionario;

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
