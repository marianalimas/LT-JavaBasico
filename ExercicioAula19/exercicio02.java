package ExercicioAula19;

import java.util.Scanner;

//Criar um vetor A com 8 elementos inteiros. 
//Construir um vetor B de mesmo tipo e tamanho e com elementos do vetor A multiplicados por 2, ou seja,
//B[i] = A[i] * 2.
//pedir para o usu�rio inserir os dados dos vetores.
public class exercicio02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA  = new int [8];
			int[] vetorB = new int [vetorA.length];
			
			for (int i=0; i>vetorA.length; i++) {
					System.out.println("Entre com o valor da posi��o: " + i);
					vetorA[i] = scan.nextInt();
					vetorB[i] = vetorA[i] * 2;
			}
			
			
			
			System.out.print("Valores vetor A = ");
				for (int i=0; i<vetorA.length; i++) {
					System.out.print(vetorA[i] + " ");	
				}
			
			System.out.println();
			
			System.out.println("Valores vetor B = ");
				for (int i=0; i<vetorB.length; i++) {
					System.out.print(vetorB[i] + " ");	
				}
		}
			
		System.out.println();
		
	}
}
