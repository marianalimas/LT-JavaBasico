package ExercicioAula15;

import java.util.Scanner;


// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class Exercicio02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			
			double num = scan.nextDouble();
			
			if (num >= 0) { System.out.println("O número é positivo.");
			} else { System.out.println("O número é negativo.");
				
				}
		}
		
		}
		

	}

