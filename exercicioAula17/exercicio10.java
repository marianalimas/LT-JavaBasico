package exercicioAula17;

import java.util.Scanner;

/*Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido entre eles.*/

public class exercicio10 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int num01 = scan.nextInt();	
			System.out.println("Digite um número: ");
			int num02 = scan.nextInt();	
		
		for (int i=num01; i<=num02; i++) {
			System.out.println(i);
		}
		}
		
		
		
		
	}

}
