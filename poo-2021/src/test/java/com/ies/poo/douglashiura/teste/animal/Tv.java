package com.ies.poo.douglashiura.teste.animal;

public class Tv extends Eletrodomestico{

	private Integer canal;

	public Tv() {
		super(Boolean.FALSE);
	}

	@Override
	public void ligar() {
		canal=5;
		setLidado(Boolean.TRUE);
	}

	@Override
	public void desligar() {
		canal=0;
		setLidado(Boolean.FALSE);
	}

	public Integer getCanal() {
		return canal;
	}
}
