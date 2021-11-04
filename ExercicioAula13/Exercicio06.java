package ExercicioAula13;

import java.util.Scanner;

public class Exercicio06 {

	//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	
	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o raio de um círculo: ");
			double raio = scan.nextDouble();
			
			//área de um círculo = 3,14 * r * r
			
			/*double pi = 3.14; 
			
			System.out.println("A área do círculo é = " + raio * raio * pi);*/
			
			//Outra maneira - LOIANE
			
			double area = Math.PI * Math.pow(raio, 2);
			
			System.out.println("A área do círculo é = " + area);
		}
		
				
		

	}

}
