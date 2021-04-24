package com.ies.poo.douglashiura.teste.estagio.codigo;

public class Nota {

	private Integer codigo;
	private Float valor;

	public Nota(Integer codigo) {
		this.codigo = codigo;
	}

	public Nota(Integer codigo, Float valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Float getValor() {
		return valor;
	}

}
