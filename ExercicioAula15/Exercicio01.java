package ExercicioAula15;

import java.util.Scanner;

//Fa�a um programa que pe�a dois n�meros e imprima o maior deles.

public class Exercicio01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro n�mero: ");
			
			double numero01 = scan.nextDouble();
			
			System.out.println("Digite o segundo n�mero: ");
			
			double numero02 = scan.nextDouble();
			
			if (numero01 > numero02) { System.out.println(" O maior n�mero �: " + numero01);
			} else { System.out.println(" O maior n�mero �: " + numero02);
			}
		}	
		
	}
	
}
