package exercicioAula17;

import java.util.Scanner;

/*Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros*/

public class exercicio08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num;
			double media;
			double soma = 0;
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Digite um n�mero: ");
				num = scan.nextInt();
				
				soma += num;
				//soma + um num de entrada ao numero
			} 
			
			media = soma / 5;
			
			System.out.println("Soma = " + soma);
			System.out.println("M�dia = " + media);
		}
	
	}

}
