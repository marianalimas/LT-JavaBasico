package ExercicioAula15;

import java.util.Scanner;

/*Fa�a um programa que pe�a um n�mero inteiro e determine se ele � par ou �mpar. Dica:utilize p m�dulo(resto da divis�o;)
 */

public class Exercicio18 {

	public static void main(String[] args) {
		
			try (Scanner scan = new Scanner(System.in)) {
					
					System.out.println("Digite um n�mero inteiro");
					int numero = scan.nextInt();
					
					if (numero % 2 == 0) {
						System.out.println("O n�mero " + numero + " �: Par.");
					} else {
						System.out.println("O n�mero " + numero + " �: �mpar.");
					}
		}
}
}