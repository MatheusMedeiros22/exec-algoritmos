import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Suponha que uma pessoa possa se aposentar pelo INSS caso atenda alguma das
		 * situa��es abaixo: � � do g�nero masculino, possui pelo menos 65 anos e pelo
		 * menos 10 anos de contribui��o. � � do g�nero masculino, possui pelo menos 63
		 * anos e pelo menos 15 anos de contribui��o. � � do g�nero feminino, possui
		 * pelo menos 63 anos e pelo menos 10 anos de contribui��o. � � do g�nero
		 * feminino, possui pelo menos 61 anos e pelo menos 15 anos de contribui��o.
		 * Crie um programa que leia um caractere (�M� ou �F�), que representa o g�nero
		 * de um indiv�duo, e dois inteiros, que representam a idade e o tempo de
		 * contribui��o. O programa dever� ent�o imprimir �Aposent�vel� se o indiv�duo
		 * atender uma das situa��es acima. Caso contr�rio, o programa dever� imprimir
		 * �N�o Aposent�vel�
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o g�nero do indiv�duo ('m'/'f'): ");
		char genero = sc.next().charAt(0);
		System.out.println("Digite a idade:");
		int idade = sc.nextInt();
		System.out.println("Digite o tempo de contribui��o:");
		int tempoContribuicao = sc.nextInt();
		
		if(genero == 'm') {
			if(idade >= 65 && tempoContribuicao >= 10) {
				System.out.println("Aposentavel");
			}else if(idade >= 63 && tempoContribuicao >= 15){
				System.out.println("Aposentavel");
			}else {
				System.out.println("N�o aposentavel");
			}
		}
		
		if(genero == 'f') {
			if(idade >= 63 && tempoContribuicao >= 10) {
				System.out.println("Aposentavel");
			}else if(idade >= 61 && tempoContribuicao >= 15){
				System.out.println("Aposentavel");
			}else {
				System.out.println("N�o aposentavel");
			}
		}
		
		sc.close();
	}

}
