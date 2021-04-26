package com.ies.poo.douglashiura.teste.estagio.codigo;

import java.util.List;

 class FormatadorPluralLegado extends FormatadorPlural {

	FormatadorPluralLegado(List<Nota> notas) {
		super(notas);
	}

	@Override
	public String formatar() {
		return esqueleto(umaNota -> Integer.toString(umaNota.getCodigo()));

	}

}
