package ExercicioAula15;

import java.util.Scanner;

public class Exercicio19 {

/*Fa�a um programa que leia dois n�meros e em seguida pergunte ao usu�rio qual opera��o ele deseja realizar. 
 * O resultado da opera��o deve ser acompanhado de uma frase que diga se o n�mero �:
 * 	1. �mpar ou par;
 * 	2. Positivo ou negativo;
 */
	
	public static void main(String[] args) {
		

		try (Scanner scan = new Scanner(System.in)) {
				
				System.out.println("Digite o primeiro n�mero");
				int num01 = scan.nextInt();
				System.out.println("Digite o segundo n�mero");
				int num02 = scan.nextInt();
				
				System.out.println("Qual opera��o voc� deseja realizar (+ = / *)?");
				String operacao = scan.next();
				
				double resultado = 0;
	//F			boolean valida = true;
				
				switch (operacao) {
				case "+": resultado = num01 + num02; break;
				case "-": resultado = num01 - num02; break;
				case "*": resultado = num01 * num02; break;
				case "/": resultado = num01 / num02; break;
				default:
					System.out.println("Opera��o Inv�lida");
					valida = false;
				}
				
				if (valida) {
					System.out.println("O n�mero " + numero + " �: Par.");
				} else {
					System.out.println("O n�mero " + numero + " �: �mpar.");
				}
		
		
		
	}

}
