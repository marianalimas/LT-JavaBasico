package exercicioAula17;

import java.util.Scanner;

//Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
//Não utilize a função potência da linguagem.


public class exercicio13 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a base: ");
			int base = scan.nextInt();
			System.out.println("Digite o expoente: ");
			int pot = scan.nextInt();
			
			int resultado = base;
			
			for (int i=1; i < pot; i++);
				resultado *= base;
System.out.println("Resultado: " + resultado);
		}
	
	}

}
