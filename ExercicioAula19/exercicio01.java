package ExercicioAula19;

import java.util.Scanner;

//Criar um vetor A com 5 elementos inteiros.
//Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja,
//B[i] = A[i].
//pedir para o usu�rio inserir os dados dos vetores.
public class exercicio01 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			//Declarei o array
			int [] vetorA = new int[5];
			int [] vetorB = new int[vetorA.length];
			
			//Fa�o um loop para o usu�rio inserir os valores
			for (int i=0; i<vetorA.length; i++){
				
				System.out.println("Entre com o valor da posi��o: " + i);
				vetorA[i] = scan.nextInt();
				vetorB[i] = vetorA[i];
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
		System.out.println();
	
	
	
	
	}


}
