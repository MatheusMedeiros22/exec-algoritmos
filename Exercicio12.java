import java.util.Scanner;

public class Exercicio12 {

	/*
	 * Informe também se as duas strings possuem o mesmo comprimento e se são iguais
	 * ou diferentes no conteúdo.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();

		boolean content = string1.equals(string2);
		boolean comprimento = string1.length() == string2.length();
		 
		System.out.println("Conteudo da primeira string é " + string1 + " e seu tamnho " + string1.length());
		System.out.println("Conteudo da segunda string é " + string2 + " e seu tamnho " + string2.length());	
		
		if (content) {
			System.out.print("Tem o mesmo conteúdo");
		} else {
			System.out.print("Conteúdo diferente");
		}

		String result = comprimento ? " e mesmo comprimento" : " e comprimento diferente";

		System.out.println(result);
		
		sc.close();

	}

}
