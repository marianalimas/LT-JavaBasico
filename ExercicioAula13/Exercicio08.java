package ExercicioAula13;

import java.util.Scanner;

//Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
//Calcule e mostre o total do seu sal�rio no referido m�s.

public class Exercicio08 {

	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite quanto voc� ganha por hora: ");
			double hora = scan.nextDouble();
			System.out.println("Digite o n�mero de horas trabalhadas por m�s: ");
			double mes = scan.nextDouble();
			
			System.out.println("O seu sal�rio mensal �: " + (hora * mes));
		}

	}

}
