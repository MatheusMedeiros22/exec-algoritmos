import java.util.Scanner;

public class Exercicio2 {

	/*
	 * Escreva um programa que leia uma string e, em seguida, imprima a inversa da
	 * string lida. 
	 * Exemplo de entrada: Tangamandapio 
	 * Impressão esperada:
	 * oipadnamagnaT
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma palavra: ");
		String palavra = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(palavra);
		System.out.println("Palavra digitada: " + palavra);
		System.out.println("Reverso da palavra digitada: " + sb.reverse());
		
	
		
		
		sc.close();
		
	
	}

}
