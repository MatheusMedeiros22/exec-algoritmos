import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Pe�a um n�mero e valide se este n�mero � divis�vel por 5.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		if(numero % 5 == 0) {
			System.out.println("O n�mero � divis�vel por 5");
		} else {
			System.out.println("N�o � divis�vel por 5");
		}
		
		sc.close();
	}

}
