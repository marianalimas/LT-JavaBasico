package exercicioAula17;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número

public class exercicio07 {

	public static void main (String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num;
			int maior = Integer.MIN_VALUE ;
				
			for (int i = 0; i < 5; i++) {
				System.out.println("Digite um número: ");
				num = scan.nextInt();
				
				if (num > maior) {
					maior = num;
				System.out.println("O maior número mudou " + maior);
				}
				
				}	
				
			System.out.println("O maior número digitado foi: " + maior);
		}
	} 

}
