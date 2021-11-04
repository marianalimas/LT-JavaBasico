package ExercicioAula13;

import java.util.Scanner;

public class Exercicio02 {

	//Faça um Programa que peça um número e então mostre a mensagem O número informado foi: [número]
	
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número:");
			int numero = scan.nextInt();
			System.out.println("Número informado foi: " + numero);
		}

	}

}
