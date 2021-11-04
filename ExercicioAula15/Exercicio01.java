package ExercicioAula15;

import java.util.Scanner;

//Faça um programa que peça dois números e imprima o maior deles.

public class Exercicio01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número: ");
			
			double numero01 = scan.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			
			double numero02 = scan.nextDouble();
			
			if (numero01 > numero02) { System.out.println(" O maior número é: " + numero01);
			} else { System.out.println(" O maior número é: " + numero02);
			}
		}	
		
	}
	
}
