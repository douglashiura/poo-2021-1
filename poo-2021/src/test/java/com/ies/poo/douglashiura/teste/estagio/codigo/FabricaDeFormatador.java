package com.ies.poo.douglashiura.teste.estagio.codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FabricaDeFormatador {

	public Formatavel obterInstancia(List<Nota> notas) {
		Objects.requireNonNull(notas);
		assegurarQueOsElementosSejamNaoNullos(notas);
		assegurarValorECodigoEmTodosAsNotas(notas);
		Formatavel formatador;
		if (notas.isEmpty()) {
			formatador = new FormatadorVazio();
		} else if (notas.size() == 1) {
			Nota unicaNota = notas.get(0);
			formatador = new FormatadorSingular(unicaNota);
		} else {
			formatador = new FormatadorPlural(notas);
		}
		return formatador;
	}

	@Deprecated
	public Formatavel obterInstanciaLegado(List lista) {
		Objects.requireNonNull(lista);
		assegurarQueOsElementosSejamNaoNullos(lista);
		Formatavel formatador;
		if (ehNotasOuVazio(lista)) {
			formatador = obterInstancia(lista);
		} else if (lista.size() == 1) {
			Integer unicaNota = (Integer) lista.get(0);
			formatador = new FormatadorSingularLegado(new Nota(unicaNota));
		} else {
			formatador = new FormatadorPluralLegado(transformaCodigoEmNota(lista));
		}
		return formatador;
	}

	private void assegurarValorECodigoEmTodosAsNotas(List<Nota> notas) {
		for (Nota nota : notas) {
			Objects.requireNonNull(nota.getValor());
			Objects.requireNonNull(nota.getCodigo());
		}
	}

	private void assegurarQueOsElementosSejamNaoNullos(List lista) {
		if (lista.contains(null)) {
			throw new RuntimeException("Elementos nulos");
		}
	}

	private List<Nota> transformaCodigoEmNota(List lista) {
		List<Nota> notas = new ArrayList<Nota>(lista.size());
		for (Object object : lista) {
			notas.add(new Nota((Integer) object));
		}
		return notas;
	}

	private boolean ehNotasOuVazio(List lista) {
		Boolean ehNotasOuVazio = false;
		if (lista.isEmpty()) {
			ehNotasOuVazio = true;
		} else {
			ehNotasOuVazio = lista.get(0) instanceof Nota;
		}
		return ehNotasOuVazio;
	}

}
