package com.ies.poo.douglashiura.teste.estagio.codigo;

import java.text.NumberFormat;

class FormatadorSingular implements Formatavel {
	protected static final String UMA_NOTA = "Fatura da nota fiscal de simples remessa: %s.";
	protected Nota nota;

	FormatadorSingular(Nota nota) {
		this.nota = nota;
	}

	@Override
	public String formatar() {
		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
		String aNotEmString = String.format("%s cujo valor é %s", nota.getCodigo(),
				currencyInstance.format(nota.getValor()));
		return String.format(UMA_NOTA, aNotEmString);
	}

}
