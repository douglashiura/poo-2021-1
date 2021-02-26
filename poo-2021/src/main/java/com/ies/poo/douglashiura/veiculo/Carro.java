package com.ies.poo.douglashiura.veiculo;

public class Carro {

	public String nome;
	private Double potencia;

	public Carro(String nome) {
		this.nome = nome;
	}

	public String acelerar(Integer quantidadeDePressaoNoPedal) {
		String ronco = "";
		for (int i = 0; i < quantidadeDePressaoNoPedal; i++) {
			ronco += "BRUM";
		}
		return ronco;
	}

	public Carro(String nome, Double potencia) {
		this.nome = nome;
		this.potencia = potencia;
	}

	public Double obterPotencia() {
		return potencia;
	}

}
