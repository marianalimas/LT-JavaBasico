package exercicioAula17;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo: */

public class exercicio12 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o número para gerar a tabuada: ");
			int num = scan.nextInt();
			
			System.out.println("Tabuada de " + num + ":");
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
		}

	}

}
