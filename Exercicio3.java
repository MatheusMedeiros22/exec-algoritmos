import java.util.Scanner;

public class Exercicio3 {

	/*
	 * 
	 * Faça um programa que use a função valorPagamento para determinar o valor a
	 * ser pago por uma prestação de uma conta. O programa deverá solicitar ao
	 * usuário o valor da prestação e o número de dias em atraso e passar estes
	 * valores para a função valorPagamento, que calculará o valor a ser pago e
	 * devolverá este valor ao programa que a chamou.
	 * 
	 * O programa deverá então exibir o valor a ser pago na tela. Após a execução, o
	 * programa deverá voltar a pedir outro valor de prestação e assim continuar até
	 * que seja informado um valor igual a zero para a prestação. Neste momento o
	 * programa deverá ser encerrado, exibindo o relatório do dia, que conterá a
	 * quantidade e o valor total de prestações pagas no dia. O cálculo do valor a
	 * ser pago é feito da seguinte forma:
	 * 
	 * Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver
	 * atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor da prestacao? ");
		double valorPrestacao = sc.nextDouble();
		System.out.println("Tem dias de atraso?");
		int diasDeAtraso = sc.nextInt();

		double pagar = valorPagamento(valorPrestacao, diasDeAtraso);
		

		do {
			System.out.println("O valor a ser pago é de = R$" + String.format("%.2f", pagar));
			System.out.println("Quanto vai pagar?");
			double valor = sc.nextDouble();
			pagar -= valor;
		} while (pagar > 0);

		sc.close();
	}

	public static double valorPagamento(double valorPrestacao, int diasDeAtraso) {

		double pagamento = 0;

		if (diasDeAtraso == 0) {
			pagamento = valorPrestacao;
		} else {
			pagamento = valorPrestacao + valorPrestacao * 0.03 + (0.01 + diasDeAtraso);
		}

		return pagamento;
	}

}
