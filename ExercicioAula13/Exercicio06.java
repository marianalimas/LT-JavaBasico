package ExercicioAula13;

import java.util.Scanner;

public class Exercicio06 {

	//Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
	
	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o raio de um c�rculo: ");
			double raio = scan.nextDouble();
			
			//�rea de um c�rculo = 3,14 * r * r
			
			/*double pi = 3.14; 
			
			System.out.println("A �rea do c�rculo � = " + raio * raio * pi);*/
			
			//Outra maneira - LOIANE
			
			double area = Math.PI * Math.pow(raio, 2);
			
			System.out.println("A �rea do c�rculo � = " + area);
		}
		
				
		

	}

}
