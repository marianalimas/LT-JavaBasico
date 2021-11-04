package ExercicioAula13;

import java.util.Scanner;

/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58.*/

public class Exercicio12 {
	
	public static void main(String[] args) {
	
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
	}
	
	
	
}
}