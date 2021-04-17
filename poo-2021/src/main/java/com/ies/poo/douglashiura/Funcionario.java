package com.ies.poo.douglashiura;

public class Funcionario {

	private Integer salario;
	private Float porcentagemICMS = 0.03f;

	public void fixarSalario(Integer salario) {
		this.salario = salario;
	}

	public void aumentarSalarioEm(Integer aumento) {
		Float salarioQuebrado = aumento - (aumento * porcentagemICMS);
		salario = salario + salarioQuebrado.intValue();
	}
	
}
