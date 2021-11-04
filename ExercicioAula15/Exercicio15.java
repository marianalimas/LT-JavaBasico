package ExercicioAula15;

import java.util.Scanner;

/*Fa�a um programa que pe�a os tr�s lados de um tri�ngulo. O programaaa dever� informar se os valores podem ser um tri�ngulo.
 * Indique, caso os lados formem um tri�ngulo, se ele �: equil�tero, is�celes ou escaleno.
 * 				Dicas:
 * 					1.Tr�s lados foram um tri�ngulo quando a soma de qualquer dois lados for maior que o terceiro.
 * 					
 * 					2.Tr�s lados iguais.
 * 					3.Dois lados iguais.
 * 					4.Tr�s lados diferentes.
 */


public class Exercicio15 {

	public static void main(String[] args) {
		
try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite lado 1:" );
			double lado1 = scan.nextDouble();
			
			System.out.println("Digite lado 2:" );
			double lado2 = scan.nextDouble();
			
			System.out.println("Digite lado 3:" );
			double lado3 = scan.nextDouble();
			
			//ser triangulo
			if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
				System.out.println("Os lados informados foram: " + lado1 + " , " + lado2 + " e " + lado3);
				if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
					System.out.println("Os lados informados formam um tri�ngulo equil�tero");
				}else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado3 == lado1 && lado3 != lado2) {
						System.out.println("Os lados informados formam um tri�ngulo is�celes");
					}else if (lado1 != lado2 &&  lado1 != lado3 && lado2 != lado3){
						System.out.println("Os lados informados formam um tri�ngulo escaleno");
					} 
			}else {
					System.out.println("Os lados informados n�o formam tringulo");
			}
		

}	
	}
}
