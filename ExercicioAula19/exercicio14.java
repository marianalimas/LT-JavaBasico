package ExercicioAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a m�dia aritm�tica simples
 dos elementos �mpares armazenados neste vetor. 
 */

public class exercicio14 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int [] vetorA = new int [10];
			
			for (int i = 0; i<vetorA.length; i++) {
				System.out.println("Entre com a posi��o " + i);
				vetorA[i] = scan.nextInt();
			}	
			
			int soma = 0;
			int impar = 0;
			for (int i = 0; i<vetorA.length; i++) {
				if(vetorA[i] % 3 == 0 ) {
					soma+= vetorA[i];
					impar++;
				}
					
			}
			System.out.print("Vetor A = " );
			for (int i=0; i<vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
				}

			System.out.println();
			
			System.out.println("Soma dos n�meros: " + soma);
			System.out.println("N�meros �mpares" + impar);
		}
		
	}

}
