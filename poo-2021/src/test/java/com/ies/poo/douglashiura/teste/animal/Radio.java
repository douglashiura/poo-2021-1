package com.ies.poo.douglashiura.teste.animal;

public class Radio extends Eletrodomestico{

	private Float frequencia;

	public Radio() {
		super(Boolean.FALSE);
	}

	@Override
	public void ligar() {
		frequencia=1200.5f;
		setLidado(Boolean.TRUE);
	}

	@Override
	public void desligar() {
		frequencia=0.0f;
		setLidado(Boolean.FALSE);
	}

	public Float getFrequencia() {
		return frequencia;
	}
}
