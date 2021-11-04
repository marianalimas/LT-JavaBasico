package ExercicioAula15;

import java.util.Scanner;

/*Faça um programa que peça os três lados de um triângulo. O programaaa deverá informar se os valores podem ser um triângulo.
 * Indique, caso os lados formem um triângulo, se ele é: equilátero, isóceles ou escaleno.
 * 				Dicas:
 * 					1.Três lados foram um triângulo quando a soma de qualquer dois lados for maior que o terceiro.
 * 					
 * 					2.Três lados iguais.
 * 					3.Dois lados iguais.
 * 					4.Três lados diferentes.
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
					System.out.println("Os lados informados formam um triângulo equilátero");
				}else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado3 == lado1 && lado3 != lado2) {
						System.out.println("Os lados informados formam um triângulo isóceles");
					}else if (lado1 != lado2 &&  lado1 != lado3 && lado2 != lado3){
						System.out.println("Os lados informados formam um triângulo escaleno");
					} 
			}else {
					System.out.println("Os lados informados não formam tringulo");
			}
		

}	
	}
}
