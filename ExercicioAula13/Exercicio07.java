package ExercicioAula13;

import java.util.Scanner;

//Fa�a um programa que calcule a �rea de um quadrado, em seguida, mostre o dobro desta �rea para o usu�rio.

public class Exercicio07 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o lado de um quadrado: ");
			double lado = scan.nextDouble();
			double quadrado = lado * lado;
			
			System.out.println("A �rea do quadrado �: " + quadrado);
			System.out.println("O dobro da �rea � : " + (quadrado * 2));
		}
		
		//Outra maneira - LOIANE
		
		/*double area = Math.pow(lado, 2);
		System.out.println("A �rea do quadrado �: " + area);*/
		
		
		

	}

}
