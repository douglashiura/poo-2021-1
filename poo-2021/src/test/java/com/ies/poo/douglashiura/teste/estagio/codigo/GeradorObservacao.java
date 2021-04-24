package com.ies.poo.douglashiura.teste.estagio.codigo;

import java.util.List;

public class GeradorObservacao {

	private FabricaDeFormatador fabrica;

	public GeradorObservacao() {
		fabrica = new FabricaDeFormatador();
	}

	@Deprecated
	public String geraObservacao(List lista) {
		Formatavel formatador = fabrica.obterInstanciaLegado(lista);
		return formatador.formatar();

	}

	public String geraObservacaoDeNotas(List<Nota> notas) {
		Formatavel formatador = fabrica.obterInstancia(notas);
		return formatador.formatar();
	}
}