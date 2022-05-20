import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/* 
		 * Considere um programa que deve classificar um número como par ou ímpar e, além disso, 
		 * classificar ele como menor do que 100 ou maior ou igual a 100. 
		 * Escreva um programa que faça essa classificação corretamente.*/

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número digitado é par!");
		} else {
			System.out.println("O número digitado é impar!");
		}
		
		String validar = numero >= 100 ? "Maior ou igual a 100!" : "Menor que 100!";
		System.out.println(validar);
		
		
		
		
		sc.close();
	}

}
