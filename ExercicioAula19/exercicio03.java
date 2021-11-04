package ExercicioAula19;

import java.util.Scanner;

public class exercicio03 {

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do
do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i]=A[i]*A[i].*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declarar o array
		int [] vetorA = new int [15];
		int [] vetorB = new int [vetorA.length];
		
		//Faço um loop para o usuário inserir os valores
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
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
	}
	
		//Para pular a linha
	
}
