package ExercicioAula15;

import java.util.Scanner;

/* Faça um programa que lê duas notas parciais obtidas por um aluno numa disciplina ao longo do semestre, e calcule a média. A atribuição de conceitos obedece à tabela abaixo:
 * 			 Média de aproveitamento x Conceitos
 				Entre 9,0 e 10,0			A
 				Entre 7,5 e 9,0	 			B
 				Entre 6,0 e 7,5				C
 				Entre 4,0 e 6,0				D
 				Entre 4,0 e 0,0				E
 	O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "APROVADO" se o conceito for A, B OU C ; "REPROVADO" se o conceito for D ou E.*/

public class Exercicio14 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite sua nota 1: ");
			double nota1 = scan.nextDouble();
			System.out.println("Digite sua nota 2: ");
			double nota2 = scan.nextDouble();
			
			double media = (nota1 + nota2) / 2;
			
			String conceito = "";
			String aproveitamento = "";

			if (media >= 9 && media == 10) {
				conceito = "A";
				aproveitamento = "Aprovado!";
			} else if (media >= 7.5 && media < 9) {
				conceito = "B";
				aproveitamento = "Aprovado!";
			}	else if (media >= 6.0 && media < 7.5) {
				conceito = "C";
				aproveitamento = "Aprovado!";
			}	else if (media >= 6.0 && media < 9) {
				conceito = "D";
				aproveitamento = "Reprovado";
			}	else if (media >= 0 && media < 4) {
				conceito = "E";
				aproveitamento = "Reprovado";
			}
			
		
			System.out.println("NOTA 1: " + nota1 + " e NOTA 2: " + nota2);
			System.out.println("A SUA MÉDIA É: " + media);
			System.out.println("O SEU CONCEITO É: " + conceito);
			System.out.println("APROVEITAMENTO: " + aproveitamento);
		}
	}
	}

