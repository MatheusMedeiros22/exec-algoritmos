import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Calcule a idade de uma pessoa de acordo com a data de nascimento dela. Voc� deve solicitar dia, m�s e ano.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe da data do seu nascimento dd/MM/yyyy: ");
		String dataNascimento = sc.next();
		int ano = Integer.parseInt(dataNascimento.substring(6));
		System.out.println("Voc� tem " + (2022 - ano) + " anos" ); //Tem que contabilizar os meses tbm
		
		sc.close();
	}

}
