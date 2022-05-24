import java.util.Scanner;

public class Exercicio3 {

	/*
	 * 
	 * Fa�a um programa que use a fun��o valorPagamento para determinar o valor a
	 * ser pago por uma presta��o de uma conta. O programa dever� solicitar ao
	 * usu�rio o valor da presta��o e o n�mero de dias em atraso e passar estes
	 * valores para a fun��o valorPagamento, que calcular� o valor a ser pago e
	 * devolver� este valor ao programa que a chamou.
	 * 
	 * O programa dever� ent�o exibir o valor a ser pago na tela. Ap�s a execu��o, o
	 * programa dever� voltar a pedir outro valor de presta��o e assim continuar at�
	 * que seja informado um valor igual a zero para a presta��o. Neste momento o
	 * programa dever� ser encerrado, exibindo o relat�rio do dia, que conter� a
	 * quantidade e o valor total de presta��es pagas no dia. O c�lculo do valor a
	 * ser pago � feito da seguinte forma:
	 * 
	 * Para pagamentos sem atraso, cobrar o valor da presta��o. Quando houver
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
			System.out.println("O valor a ser pago � de = R$" + String.format("%.2f", pagar));
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
