package com.ies.poo.douglashiura.jogo;

public class JogoParEImpar {

	private Acao primeiraAcao;
	private Acao segundaAcao;

	public synchronized void adicionarAcao(Acao doJogador) {
		if (primeiraAcao == null) {
			primeiraAcao = doJogador;
		} else {
			segundaAcao = doJogador;
		}
	}

	public ResultadoVencedor obterResultado() {
		dormeAteExistirASegundaJogada();
		Integer somatorio = Integer.sum(primeiraAcao.obterEntrada(), segundaAcao.obterEntrada());
		Boolean ehPar = ehPar(somatorio);
		Jogador jogadorVencedor = null;
		if (ehPar) {
			jogadorVencedor = encontrarOJogadorQueFezAAcaoDePar();
			return new ResultadoVencedor(Numeros.PAR, jogadorVencedor);
		} else {
			jogadorVencedor = encontrarOJogadorQueFezAApostaImpar();
			return new ResultadoVencedor(Numeros.IMPAR, jogadorVencedor);
		}
	}

	private void dormeAteExistirASegundaJogada() {
		while (segundaAcao == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

	}

	private Boolean ehPar(Integer somatorio) {
		Boolean ehPar = somatorio % 2 == 0;
		return ehPar;
	}

	private Jogador encontrarOJogadorQueFezAApostaImpar() {
		return encontrarOJogadorQueFezAApostaDoTipo(Numeros.IMPAR);
	}

	private Jogador encontrarOJogadorQueFezAAcaoDePar() {
		return encontrarOJogadorQueFezAApostaDoTipo(Numeros.PAR);
	}

	private Jogador encontrarOJogadorQueFezAApostaDoTipo(Numeros tipo) {
		if (primeiraAcao.resultadoEsperadoPeloJogador.equals(tipo)) {
			return primeiraAcao.jogador;
		} else {
			return segundaAcao.jogador;
		}
	}
}
