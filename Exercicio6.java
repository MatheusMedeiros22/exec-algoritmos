import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 
		 * Leia um n�mero inteiro que representa um c�digo de DDD para discagem
		 * interurbana. Em seguida, informe � qual cidade o DDD pertence, considerando a
		 * tabela abaixo. Obs: **Se a entrada for qualquer outro DDD que n�o esteja
		 * presente na tabela acima, o programa dever� informar: �DDD nao cadastrado�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o DDD");
		int ddd = sc.nextInt();
		
		System.out.print("Destination: ");
		switch(ddd) {
			case 61:
				System.out.println("Brasilia");
				break;
			case 71:
				System.out.println("Salvador");
				break;
			case 11:
				System.out.println("S�o Paulo");
				break;
			case 21:
				System.out.println("Rio de Janeiro");
				break;
			case 32:
				System.out.println("Juiz de Fora");
				break;
			case 19:
				System.out.println("Campinas");
				break;
			case 27:
				System.out.println("Vitoria");
				break;
			case 31:
				System.out.println("Belo Horizonte");
				break;
			default:
				System.out.println("DDD n�o cadastrado");
				break;
		}
		
		sc.close();
	}

}
