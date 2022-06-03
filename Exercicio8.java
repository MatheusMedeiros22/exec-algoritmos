import java.util.Scanner;

import secundaryclass.ConversaoTemp;

public class Exercicio8 {

	/*
	 * Faça um programa que peça a temperatura em graus Fahrenheit (°F), transforme
	 * e mostre a temperatura em graus Celsius (°C). A fórmula de conversão está em
	 * anexo.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit (°F)");
		double temp = sc.nextDouble();
		
		
		System.out.println("A temperatura em Celsius é " +String.format("%.2f", ConversaoTemp.conversao(temp))+ " (°C)");
	
		sc.close();
	}

}
