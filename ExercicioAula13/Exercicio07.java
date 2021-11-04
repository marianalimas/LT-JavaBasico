package ExercicioAula13;

import java.util.Scanner;

//Faça um programa que calcule a área de um quadrado, em seguida, mostre o dobro desta área para o usuário.

public class Exercicio07 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o lado de um quadrado: ");
			double lado = scan.nextDouble();
			double quadrado = lado * lado;
			
			System.out.println("A área do quadrado é: " + quadrado);
			System.out.println("O dobro da área é : " + (quadrado * 2));
		}
		
		//Outra maneira - LOIANE
		
		/*double area = Math.pow(lado, 2);
		System.out.println("A área do quadrado é: " + area);*/
		
		
		

	}

}
