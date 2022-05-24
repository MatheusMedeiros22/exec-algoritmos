
public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa com uma função chamada somaImposto. A função possui dois
		 * parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
		 * expressa em porcentagem, e custo, que é o custo de um item antes do imposto.
		 * A função “altera” o valor de custo para incluir o imposto sobre vendas.
		 */
		final double IMPOSTO = 8;
		double custo = 1000;
		
		System.out.println("O valor do item é de R$" + custo );
		System.out.println("O imposto sobre a venda é de " + IMPOSTO + "%");
		System.out.println("O valor a pagar pelo produto é R$" + somaImposto(IMPOSTO, custo));
		
	}
	
	
	public static double somaImposto(double taxaImposto, double custo) {
		return custo = custo + custo * (taxaImposto / 100);
	}
}
