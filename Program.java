import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/* 
		 * Considere um programa que deve classificar um n�mero como par ou �mpar e, al�m disso, 
		 * classificar ele como menor do que 100 ou maior ou igual a 100. 
		 * Escreva um programa que fa�a essa classifica��o corretamente.*/

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero digitado � par!");
		} else {
			System.out.println("O n�mero digitado � impar!");
		}
		
		String validar = numero >= 100 ? "Maior ou igual a 100!" : "Menor que 100!";
		System.out.println(validar);
		
		
		
		
		sc.close();
	}

}
