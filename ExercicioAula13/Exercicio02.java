package ExercicioAula13;

import java.util.Scanner;

public class Exercicio02 {

	//Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi: [n�mero]
	
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um n�mero:");
			int numero = scan.nextInt();
			System.out.println("N�mero informado foi: " + numero);
		}

	}

}
