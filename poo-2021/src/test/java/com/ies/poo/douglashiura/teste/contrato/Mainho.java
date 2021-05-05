package com.ies.poo.douglashiura.teste.contrato;

public class Mainho {

	public static void main(String[] args) {
		Movimentavel umMovimentavel = new Homem();
		System.out.println(umMovimentavel.mover());
		umMovimentavel = new Veiculo();
		System.out.println(umMovimentavel.mover());
		umMovimentavel = new Homem();
		
	}
}
