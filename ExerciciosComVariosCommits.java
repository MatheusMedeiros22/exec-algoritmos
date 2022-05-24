import java.util.Locale;
import java.util.Scanner;

public class ExerciciosComVariosCommits {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que pergunte o quanto você ganha por hora e o número de
		 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
		 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
		 * INSS e 5% para o sindicato.
		 * 
		 * O programa deve nos informar:
		 * 
		 * A. salário bruto. B. quanto pagou ao INSS. C. quanto pagou ao sindicato. D. o
		 * salário líquido.
		 * 
		 * Calcule os descontos e o salário líquido, conforme a tabela abaixo:
		 * 
		 * + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$
		 * = Salário Liquido : R$
		 * 
		 * Obs.: Salário Bruto - Descontos = Salário Líquido.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numero = 3;
		int[] vect = new int[numero];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		for(int vect2 : vect) {
			System.out.print(vect2 + " ");
		}
		
		
			if(vect[0] > vect [1]) {
				System.out.println("Ordem decresente");
			}else {
				System.out.println("Ordem crescente");
			}
		

		sc.close();
	}

}
