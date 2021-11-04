package exercicioAula17;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capz de gerar a tabuada de qualquer n�mero inteiro entre 1 e 10.
 * O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
 * A sa�da deve ser conforme o exemplo abaixo: */

public class exercicio12 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o n�mero para gerar a tabuada: ");
			int num = scan.nextInt();
			
			System.out.println("Tabuada de " + num + ":");
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
		}

	}

}
