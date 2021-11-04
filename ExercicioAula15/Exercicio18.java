package ExercicioAula15;

import java.util.Scanner;

/*Faça um programa que peça um número inteiro e determine se ele é par ou ímpar. Dica:utilize p módulo(resto da divisão;)
 */

public class Exercicio18 {

	public static void main(String[] args) {
		
			try (Scanner scan = new Scanner(System.in)) {
					
					System.out.println("Digite um número inteiro");
					int numero = scan.nextInt();
					
					if (numero % 2 == 0) {
						System.out.println("O número " + numero + " é: Par.");
					} else {
						System.out.println("O número " + numero + " é: Ímpar.");
					}
		}
}
}