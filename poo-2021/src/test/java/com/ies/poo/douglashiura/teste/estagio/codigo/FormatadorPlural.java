package com.ies.poo.douglashiura.teste.estagio.codigo;

import java.text.NumberFormat;
import java.util.List;
import java.util.function.Function;

class FormatadorPlural implements Formatavel {
	private static final String PONTO = ".";
	private static final String VIRGULA_DE_LIGACAO = ", ";
	private static final String E_DE_LIGACAO = " e ";
	private static final String DUAS_OU_MAIS_NOTAS = "Fatura das notas fiscais de simples remessa: ";
	private List<Nota> notas;

	FormatadorPlural(List<Nota> notas) {
		this.notas = notas;
	}

	@Override
	public String formatar() {
		NumberFormat formatador = NumberFormat.getCurrencyInstance();
		Function<Nota, String> formatadorDeNota = umaNota -> {
			String valor = formatador.format(umaNota.getValor());
			return String.format("%s cujo valor é %s", umaNota.getCodigo(), valor);
		};
		String esqueleto = esqueleto(formatadorDeNota);
		return esqueleto.concat(String.format(" Total = %s.", formatador.format(total())));
	}

	private Float total() {
		return notas.stream().map(umaNota -> umaNota.getValor()).reduce(0f, Float::sum);
	}

	protected String esqueleto(Function<Nota, String> formatadorDeNota) {
		StringBuilder texto = new StringBuilder();
		texto.append(DUAS_OU_MAIS_NOTAS);
		for (int indice = 0; indice < notas.size(); indice++) {
			Nota umaNota = notas.get(indice);
			if (ehOUltimo(indice)) {
				texto.append(E_DE_LIGACAO);
			} else if (naoEhOPrimeiro(indice)) {
				texto.append(VIRGULA_DE_LIGACAO);
			}
			texto.append(formatadorDeNota.apply(umaNota));
		}
		texto.append(PONTO);
		return texto.toString();
	}

	private boolean ehOUltimo(int index) {
		return index + 1 == notas.size();
	}

	private boolean naoEhOPrimeiro(int index) {
		return index != 0;
	}

}
