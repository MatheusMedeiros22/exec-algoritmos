import java.util.Locale;
import java.util.Scanner;

public class Program {

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
		
		System.out.println("How much do you earn per hour?");
		double earnPerHour = sc.nextDouble();
		System.out.println("How much hours work per month");
		int hoursWorkPerMonth = sc.nextInt();
		
		double salarioBruto = earnPerHour * hoursWorkPerMonth;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.11;
		double salarioLiquido = salarioBruto - inss - sindicato;
		
		System.out.println("Salario Bruto: R$ " + String.format("%.2f", salarioBruto));
		System.out.println("INSS: R$ " + String.format("%.2f", inss));
		System.out.println("Sindicato: R$ " + String.format("%.2f", sindicato));
		System.out.println("Salario Liquido: R$ " + String.format("%.2f", salarioLiquido));
		

		sc.close();
	}

}
