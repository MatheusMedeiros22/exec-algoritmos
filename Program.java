import java.util.Locale;
import java.util.Scanner;

public class Program {

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
