import java.util.Scanner;

import secundaryclass.ConversaoTemp;

public class Exercicio8 {

	/*
	 * Fa�a um programa que pe�a a temperatura em graus Fahrenheit (�F), transforme
	 * e mostre a temperatura em graus Celsius (�C). A f�rmula de convers�o est� em
	 * anexo.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit (�F)");
		double temp = sc.nextDouble();
		
		
		System.out.println("A temperatura em Celsius � " +String.format("%.2f", ConversaoTemp.conversao(temp))+ " (�C)");
	
		sc.close();
	}

}
