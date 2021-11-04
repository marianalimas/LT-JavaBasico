package ExercicioAula15;


//Faça um programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda etc), se digitar outro valor deve aparecer valor inválido.

import java.util.Scanner;

public class Exercicio13 {
	
	
			public static void main(String[] args) {
		
				try (Scanner scan = new Scanner(System.in)) {
					System.out.println("Digite um número: ");		
					int semana = scan.nextInt();
					
					if (semana == 1) {
						System.out.println("Domingo");
					}	else if (semana == 2) {
						System.out.println("Segunda");
					}	else if (semana == 3) {
						System.out.println("Terça");
					}	else if (semana == 4) {
						System.out.println("Quarta");
					}	else if (semana == 5) {
						System.out.println("Quinta");
					}	else if (semana == 6) {
						System.out.println("Sexta");
					}	else if (semana == 7) {
						System.out.println("Sábado");
					}	else {
						System.out.println("Comando inválido");
					}
				}
			
			
			}
	}

