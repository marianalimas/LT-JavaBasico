package exercicioAula17;

import java.util.Scanner;

//Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero.
//N�o utilize a fun��o pot�ncia da linguagem.


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
