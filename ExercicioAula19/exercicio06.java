package ExercicioAula19;

import java.util.Scanner;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos 
respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i]; */

public class exercicio06 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [10];
		int [] vetorC = new int [vetorA.length];
		
		for (int i = 0; i<vetorA.length; i++) {
			System.out.println("Insira o valor " + i + " do Vetor A");
			vetorA [i] = scan.nextInt();
		}	
		//Para pular a linha
		System.out.println();	
			for (int i = 0; i<vetorB.length; i++) {
				System.out.println("Insira o valor " + i + " do Vetor B");
				vetorB [i] = scan.nextInt();
				vetorC [i] = vetorA [i] + vetorB [i];
		}
		
			//Para pular a linha
			System.out.println();
			
			//loop para mostrar todos os valores do vetor A, um ao lado do outro
			System.out.print("Vetor A = " );
			for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			}

			//Para pular a linha
			System.out.println();
			
			//loop para mostrar todos os valores do vetor B, um ao lado do outro
			System.out.print("Vetor B = " );
			for (int i=0; i<vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
			}
			//loop para mostrar todos os valores do vetor C, um ao lado do outro
			System.out.print("Vetor C = " );
			for (int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
			}

			
		
		
		
		
		
		
		
		}
		
		
		
		
	}

}
