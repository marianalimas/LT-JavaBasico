package ExercicioAula13;

import java.util.Scanner;

//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

public class Exercicio08 {

	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite quanto você ganha por hora: ");
			double hora = scan.nextDouble();
			System.out.println("Digite o número de horas trabalhadas por mês: ");
			double mes = scan.nextDouble();
			
			System.out.println("O seu salário mensal é: " + (hora * mes));
		}

	}

}
