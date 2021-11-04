package ExercicioAula13;

import java.util.Scanner;

//Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.

public class Exercicio09 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a temperatura em Farenheit: ");
			
			double tempF = scan.nextDouble();
			
			double tempC = (5 * (tempF-32) / 9);
			
			System.out.println("A temperatura equivalente em Celsius é: " + tempC);
		}
		
	}

}
