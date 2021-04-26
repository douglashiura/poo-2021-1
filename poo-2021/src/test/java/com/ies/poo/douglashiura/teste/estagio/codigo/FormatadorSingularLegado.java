package com.ies.poo.douglashiura.teste.estagio.codigo;

 class FormatadorSingularLegado extends FormatadorSingular{

	FormatadorSingularLegado(Nota nota) {
		super(nota);
	}

	@Override
	public String formatar() {
		return String.format(UMA_NOTA, nota.getCodigo());
	}

}
