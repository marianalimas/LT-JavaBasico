package ExercicioAula13;

import java.util.Scanner;

//Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

public class Exercicio10 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = scan.nextDouble();
			double f = c * 1.8 + 32;
			
			System.out.println("A temperatura " + c + "C é igual a " + f + "F");
		}

	}

}
