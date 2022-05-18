import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Peça um número e valide se este número é divisível por 5.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		if(numero % 5 == 0) {
			System.out.println("O número é divisível por 5");
		} else {
			System.out.println("Não é divisível por 5");
		}
		
		sc.close();
	}

}
