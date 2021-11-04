package ExercicioAula13;

import java.util.Scanner;

public class Exercicio03 {
	
	//Faça um Programa que peça dois número e imprima a soma

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número inteiro");
			int numero01 = scan.nextInt();
			System.out.println("Digite outro número inteiro");
			int numero02 = scan.nextInt();
			System.out.println("A soma dos números é =  " + (numero01 + numero02));
			
			//Outra maneira
			
			System.out.println("Digite dois números inteiro");
			int numero03 = scan.nextInt();
			int numero04 = scan.nextInt();
			System.out.println("A soma dos números é =  " + (numero03 + numero04));
		}

	}

}
