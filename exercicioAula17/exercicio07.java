package exercicioAula17;

import java.util.Scanner;

//Fa�a um programa que leia 5 n�meros e informe o maior n�mero

public class exercicio07 {

	public static void main (String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num;
			int maior = Integer.MIN_VALUE ;
				
			for (int i = 0; i < 5; i++) {
				System.out.println("Digite um n�mero: ");
				num = scan.nextInt();
				
				if (num > maior) {
					maior = num;
				System.out.println("O maior n�mero mudou " + maior);
				}
				
				}	
				
			System.out.println("O maior n�mero digitado foi: " + maior);
		}
	} 

}
