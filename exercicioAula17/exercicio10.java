package exercicioAula17;

import java.util.Scanner;

/*Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido entre eles.*/

public class exercicio10 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um n�mero: ");
			int num01 = scan.nextInt();	
			System.out.println("Digite um n�mero: ");
			int num02 = scan.nextInt();	
		
		for (int i=num01; i<=num02; i++) {
			System.out.println(i);
		}
		}
		
		
		
		
	}

}
