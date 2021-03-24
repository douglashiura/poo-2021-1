package com.ies.poo.douglashiura.teste.niveis.de.acesso;

import org.junit.Test;

import com.ies.poo.douglashiura.Funcionario;

public class TesteFuncionario {

	@Test
	public void aumentarSalario() throws Exception {
		Funcionario douglas = new Funcionario();
		douglas.fixarSalario(28) ;
		douglas.aumentarSalarioEm(50);
	}

}
