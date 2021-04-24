package com.ies.poo.douglashiura.teste.animal;

public abstract class Eletrodomestico {

	private Boolean lidado;

	public Eletrodomestico(Boolean ligado) {
		lidado = ligado;
	}

	public abstract void ligar();

	public abstract void desligar();

	public void setLidado(Boolean lidado) {
		this.lidado = lidado;
	}

	public Boolean getLidado() {
		return lidado;
	}
}
