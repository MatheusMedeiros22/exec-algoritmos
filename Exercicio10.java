import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
	
	/*
	 * Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia aritm�tica delas, usando listas.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Double> notas = new ArrayList<>();
		
		System.out.println("Digite a primeira nota");
		notas.add(sc.nextDouble());
		System.out.println("Digite a segunda nota");
		notas.add(sc.nextDouble());
		System.out.println("Digite a terceira nota");
		notas.add(sc.nextDouble());
		System.out.println("Digite a quarta nota");
		notas.add(sc.nextDouble());
		
		
		double media = 0.0;
		
		for(Double nota: notas) {
			media+= nota;
		}
		
		System.out.println("A m�dia aritm�tica � " + media/notas.size());
		
		
		sc.close();
	}

}
