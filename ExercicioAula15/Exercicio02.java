package ExercicioAula15;

import java.util.Scanner;


// Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo
public class Exercicio02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um n�mero: ");
			
			double num = scan.nextDouble();
			
			if (num >= 0) { System.out.println("O n�mero � positivo.");
			} else { System.out.println("O n�mero � negativo.");
				
				}
		}
		
		}
		

	}

