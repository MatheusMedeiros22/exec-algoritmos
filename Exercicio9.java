import java.util.Scanner;

public class Exercicio9 {

	/*
	 * Faça um programa que receba um número e usando laços de repetição calcule e
	 * mostre a tabuada desse número.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver a sua tabuada");
		int numero = sc.nextInt();
		System.out.println("Deseja ver a tabuada até que número");
		int limite = sc.nextInt();		
		
		for (int i = 1; i <= limite; i++) {
			System.out.println(numero +"*"+ i +"= "+ (numero*i) );
		}

		sc.close();
	}

}
