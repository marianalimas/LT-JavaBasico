package ExercicioAula19;

import java.util.Scanner;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados
//nesse vetor.

public class exercicio12 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		//Declarar o array
		int [] vetorA = new int [10];
		
		//O usuário declara o valor de cada elemento.
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		//Declaro uma variável e faço um loop para somar todos os números.
		int soma = 0;
		for(int i = 0; i<vetorA.length; i++) {
			soma += vetorA[i];
		}
		//loop para mostrar todos os valores do vetor A, um ao lado do outro
		System.out.print("Vetor A = " );
		for (int i=0; i<vetorA.length; i++) {
		System.out.print(vetorA[i] + " ");
			}
		System.out.println();
		System.out.println("Quantidade de números: " + soma);


}
}