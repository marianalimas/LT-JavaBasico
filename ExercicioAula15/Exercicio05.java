package ExercicioAula15;

import java.util.Scanner;

/*Fa�a um programa para a leitura de duas notas parciais de um aluno.
	O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		1. A mensagem "Aprovado", se a m�dia for maior ou igual a sete;
		2. A mensagem "Reprovado", se a m�dia for menor do que sete;
		3. A mensagem "Aprovado com distin��o", se a m�dia for igual a dez.*/

public class Exercicio05 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com sua primeira nota parcial");
			double nota01 = scan.nextDouble();
			System.out.println("Entre com sua segunda nota parcial");
			double nota02 = scan.nextDouble();
			
			double media = (nota01+nota02)/2;
			
			if (media < 7) {
				System.out.println("Reprovado");
			} else if (media >= 7 && media < 10) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Aprovado com distin��o");
			}
		}
		
	}

}
