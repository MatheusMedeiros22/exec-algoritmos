import java.util.Scanner;

public class Exercicio12 {

	/*
	 * Informe tamb�m se as duas strings possuem o mesmo comprimento e se s�o iguais
	 * ou diferentes no conte�do.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();

		boolean content = string1.equals(string2);
		boolean comprimento = string1.length() == string2.length();
		 
		System.out.println("Conteudo da primeira string � " + string1 + " e seu tamnho " + string1.length());
		System.out.println("Conteudo da segunda string � " + string2 + " e seu tamnho " + string2.length());	
		
		if (content) {
			System.out.print("Tem o mesmo conte�do");
		} else {
			System.out.print("Conte�do diferente");
		}

		String result = comprimento ? " e mesmo comprimento" : " e comprimento diferente";

		System.out.println(result);
		
		sc.close();

	}

}
