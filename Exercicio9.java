import java.util.Scanner;

public class Exercicio9 {

	/*
	 * Fa�a um programa que receba um n�mero e usando la�os de repeti��o calcule e
	 * mostre a tabuada desse n�mero.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver a sua tabuada");
		int numero = sc.nextInt();
		System.out.println("Deseja ver a tabuada at� que n�mero");
		int limite = sc.nextInt();		
		
		for (int i = 1; i <= limite; i++) {
			System.out.println(numero +"*"+ i +"= "+ (numero*i) );
		}

		sc.close();
	}

}
