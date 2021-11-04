package ExercicioAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos 
armazenados neste vetor que são pares.*/

public class exercicio11 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			//Declarar o array
			int [] vetorA = new int [10];
			
			//O usuário declara o valor de cada elemento.
			for(int i = 0; i<vetorA.length; i++) {
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = scan.nextInt();
			}
			//Declaro uma variável e faço um loop pra avaliar quais números são pares.
			int qtdDePar = 0;
			for(int i = 0; i<vetorA.length; i++) {
				if (vetorA[i] % 2 == 0) {
					qtdDePar +=1;
				}
			}
			//loop para mostrar todos os valores do vetor A, um ao lado do outro
			System.out.print("Vetor A = " );
			for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
				}
			System.out.println();
			System.out.println("Quantidade de números pares: " + qtdDePar);
		}

	
			
  }
}