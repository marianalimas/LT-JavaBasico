package exercicioAula17;

import java.util.Scanner;

/* Fa�a um programa que pe�a uma nota entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.*/
 
public class exercicio01 {

	public static void main(String[] args) {
		
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Digite uma nota entre 1 e 10:");
				int num01 = scan.nextInt();
				
				if (num01 <= 0) {
				System.out.println("Valor inv�lido, tente novamente");
				}else if (num01 > 10 ) {
				System.out.println("Valor inv�lido, tente novamente");
				}
				else {
					System.out.println("A sua nota �: " + num01);
				}
			}
			
	}

}
