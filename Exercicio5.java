import java.util.Scanner;

public class Exercicio5 {

	/*
	 * Crie o jogo “Pedra, Papel, Tesoura” por meio de um código em Python. Para
	 * isso, solicite que o primeiro jogador informe a sua escolha e depois o mesmo
	 * para o segundo jogador. Por fim, utilize os if’s para saber quem seria o
	 * vencedor.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("JOGO - PEDRA, PAPEL, TESOURA");
		System.out.println("JOGADOR 1 - ESCOLHA: ");
		String jogador1 = sc.nextLine();
		System.out.println("JOGADOR 2 - ESCOLHA: ");
		String jogador2 = sc.nextLine();
		
		jogador1 = jogador1.toLowerCase();
		jogador2 = jogador2.toLowerCase();
		
		if(jogador1.equals("pedra") && jogador2.equals("tesoura")) {
			System.out.println("Jogador 1 venceu!");
		}else if(jogador1.equals("tesoura") && jogador2.equals("papel")) {
			System.out.println("Jogador 1 venceu!");
		}else if(jogador1.equals("papel") && jogador2.equals("pedra")) {
			System.out.println("Jogador 1 venceu!");
		}else {
			System.out.println("Jogador 2 venceu!");
		}
		
		
		
		sc.close();
	}

}
