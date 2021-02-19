package com.ies.poo.douglashiura.animal;

public class Cachorro {

	private String nome;

	public Cachorro(String nome) {
		this.nome = nome;
	}

	public String obterNome() {
		return nome;
	}

	public String latir() {
		return "Au Au!";
	}

}
