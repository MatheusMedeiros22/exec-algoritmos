
public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa com uma fun��o chamada somaImposto. A fun��o possui dois
		 * par�metros formais: taxaImposto, que � a quantia de imposto sobre vendas
		 * expressa em porcentagem, e custo, que � o custo de um item antes do imposto.
		 * A fun��o �altera� o valor de custo para incluir o imposto sobre vendas.
		 */
		final double IMPOSTO = 8;
		double custo = 1000;
		
		System.out.println("O valor do item � de R$" + custo );
		System.out.println("O imposto sobre a venda � de " + IMPOSTO + "%");
		System.out.println("O valor a pagar pelo produto � R$" + somaImposto(IMPOSTO, custo));
		
	}
	
	
	public static double somaImposto(double taxaImposto, double custo) {
		return custo = custo + custo * (taxaImposto / 100);
	}
}
