import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Suponha que uma pessoa possa se aposentar pelo INSS caso atenda alguma das
		 * situações abaixo: • É do gênero masculino, possui pelo menos 65 anos e pelo
		 * menos 10 anos de contribuição. • É do gênero masculino, possui pelo menos 63
		 * anos e pelo menos 15 anos de contribuição. • É do gênero feminino, possui
		 * pelo menos 63 anos e pelo menos 10 anos de contribuição. • É do gênero
		 * feminino, possui pelo menos 61 anos e pelo menos 15 anos de contribuição.
		 * Crie um programa que leia um caractere (‘M’ ou ‘F’), que representa o gênero
		 * de um indivíduo, e dois inteiros, que representam a idade e o tempo de
		 * contribuição. O programa deverá então imprimir “Aposentável” se o indivíduo
		 * atender uma das situações acima. Caso contrário, o programa deverá imprimir
		 * “Não Aposentável”
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o gênero do indivíduo ('m'/'f'): ");
		char genero = sc.next().charAt(0);
		System.out.println("Digite a idade:");
		int idade = sc.nextInt();
		System.out.println("Digite o tempo de contribuição:");
		int tempoContribuicao = sc.nextInt();
		
		if(genero == 'm') {
			if(idade >= 65 && tempoContribuicao >= 10) {
				System.out.println("Aposentavel");
			}else if(idade >= 63 && tempoContribuicao >= 15){
				System.out.println("Aposentavel");
			}else {
				System.out.println("Não aposentavel");
			}
		}
		
		if(genero == 'f') {
			if(idade >= 63 && tempoContribuicao >= 10) {
				System.out.println("Aposentavel");
			}else if(idade >= 61 && tempoContribuicao >= 15){
				System.out.println("Aposentavel");
			}else {
				System.out.println("Não aposentavel");
			}
		}
		
		sc.close();
	}

}
