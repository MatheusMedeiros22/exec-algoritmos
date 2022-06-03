import java.util.Scanner;

public class Exercicio11 {

	/*
	 * Faça um programa que solicite a data de nascimento (dd/mm/aaaa) do usuário e
	 * imprima a data com o nome do mês por extenso
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String data = sc.nextLine();

		String[] datas = data.split("/");

		int dataNumerico = Integer.parseInt(datas[1]);

		switch (dataNumerico) {
		case 1:
			System.out.println("Vocé nasceu em " +datas[0]+ " Janeiro" + " de " +datas[2]);
			break;
		case 2:
			System.out.println("Vocé nasceu em " +datas[0]+ " Fevereiro" + " de " +datas[2]);
			break;
		case 3:
			System.out.println("Vocé nasceu em " +datas[0]+ " Março" + " de " +datas[2]);
			break;
		case 4:
			System.out.println("Vocé nasceu em " +datas[0]+ " Abril" + " de " +datas[2]);
			break;
		case 5:
			System.out.println("Vocé nasceu em " +datas[0]+ " Maio" + " de " +datas[2]);
			break;
		case 6:
			System.out.println("Vocé nasceu em " +datas[0]+ " Junho" + " de " +datas[2]);
			break;
		case 7:
			System.out.println("Vocé nasceu em " +datas[0]+ " Julho" + " de " +datas[2]);
			break;
		case 8:
			System.out.println("Vocé nasceu em " +datas[0]+ " Agosto" + " de " +datas[2]);
			break;
		case 9:
			System.out.println("Vocé nasceu em " +datas[0]+ " Setembro" + " de " +datas[2]);
			break;
		case 10:
			System.out.println("Vocé nasceu em " +datas[0]+ " Outubro" + " de " +datas[2]);
			break;
		case 11:
			System.out.println("Vocé nasceu em " +datas[0]+ " Novembro" + " de " +datas[2]);
			break;
		case 12:
			System.out.println("Vocé nasceu em " +datas[0]+ " Dezembro" + " de " +datas[2]);
			break;
		default:
			System.out.println("Data inexistente");
		}
		
		sc.close();
	}

}
