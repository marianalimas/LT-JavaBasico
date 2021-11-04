package ExercicioAula15;

import java.util.Scanner;

public class Exercicio19 {

/*Faça um programa que leia dois números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
 * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
 * 	1. Ímpar ou par;
 * 	2. Positivo ou negativo;
 */
	
	public static void main(String[] args) {
		

		try (Scanner scan = new Scanner(System.in)) {
				
				System.out.println("Digite o primeiro número");
				int num01 = scan.nextInt();
				System.out.println("Digite o segundo número");
				int num02 = scan.nextInt();
				
				System.out.println("Qual operação você deseja realizar (+ = / *)?");
				String operacao = scan.next();
				
				double resultado = 0;
	//F			boolean valida = true;
				
				switch (operacao) {
				case "+": resultado = num01 + num02; break;
				case "-": resultado = num01 - num02; break;
				case "*": resultado = num01 * num02; break;
				case "/": resultado = num01 / num02; break;
				default:
					System.out.println("Operação Inválida");
					valida = false;
				}
				
				if (valida) {
					System.out.println("O número " + numero + " é: Par.");
				} else {
					System.out.println("O número " + numero + " é: Ímpar.");
				}
		
		
		
	}

}
