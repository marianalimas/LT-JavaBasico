package exercicioAula17;

import java.util.Scanner;

/* Faça um programa que peça uma nota entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
 
public class exercicio01 {

	public static void main(String[] args) {
		
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Digite uma nota entre 1 e 10:");
				int num01 = scan.nextInt();
				
				if (num01 <= 0) {
				System.out.println("Valor inválido, tente novamente");
				}else if (num01 > 10 ) {
				System.out.println("Valor inválido, tente novamente");
				}
				else {
					System.out.println("A sua nota é: " + num01);
				}
			}
			
	}

}
