package ExercicioAula13;

import java.util.Scanner;

public class Exercicio03 {
	
	//Fa�a um Programa que pe�a dois n�mero e imprima a soma

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um n�mero inteiro");
			int numero01 = scan.nextInt();
			System.out.println("Digite outro n�mero inteiro");
			int numero02 = scan.nextInt();
			System.out.println("A soma dos n�meros � =  " + (numero01 + numero02));
			
			//Outra maneira
			
			System.out.println("Digite dois n�meros inteiro");
			int numero03 = scan.nextInt();
			int numero04 = scan.nextInt();
			System.out.println("A soma dos n�meros � =  " + (numero03 + numero04));
		}

	}

}
