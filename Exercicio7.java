import java.util.Scanner;

public class Exercicio7 {
	/*
	 * Crie um programa que peça um número e imprima na tela se ele é positivo, negativo ou neutro (zero).
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		System.out.print("Numero ");
		if(numero > 0) {
			System.out.println("Positivo");
		}else if(numero < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Neutro");
		}
		
		sc.close();
	}
	

	
	
	
}
