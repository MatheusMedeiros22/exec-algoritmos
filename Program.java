import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
		 * que calcule seu peso ideal, utilizando as seguintes fórmulas: • Para homens:
		 * (72.7h) - 58 • Para mulheres: (62.1h) - 44.7
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu gênero (m,f) ");
		char genero = sc.next().charAt(0);
		System.out.println("Digite a sua altura: ");
		double altura = sc.nextDouble();
		
		double pesoIdeal = 0.0;
		
		if(genero == 'm') {
			pesoIdeal += (72.7 * altura) - 58;
		}else {
			pesoIdeal += (62.1 * altura) - 44.7;
		}
		
		System.out.println("Seu peso ideal é = " + String.format("%.2f", pesoIdeal) + "kg");
		

		sc.close();
	}

}
