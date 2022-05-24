import java.util.Locale;
import java.util.Scanner;

public class ExerciciosComVariosCommits {

	public static void main(String[] args) {

		/*
		 * Fa�a um Programa que pergunte o quanto voc� ganha por hora e o n�mero de
		 * horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido
		 * m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o
		 * INSS e 5% para o sindicato.
		 * 
		 * O programa deve nos informar:
		 * 
		 * A. sal�rio bruto. B. quanto pagou ao INSS. C. quanto pagou ao sindicato. D. o
		 * sal�rio l�quido.
		 * 
		 * Calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		 * 
		 * + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$
		 * = Sal�rio Liquido : R$
		 * 
		 * Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
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
