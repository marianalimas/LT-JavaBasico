package ExercicioAula13;

import java.util.Scanner;

public class Exercicio04 {

	//Fa�a um programa que pe�a as 4 notas bimestrais e mostre a m�dia
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite m�dia do primeiro bimestre: ");
			double numero01 = scan.nextDouble();
			System.out.println("Digite m�dia do segundo bimestre: ");
			double numero02 = scan.nextDouble();
			System.out.println("Digite m�dia do terceiro bimestre: ");
			double numero03 = scan.nextDouble();
			System.out.println("Digite m�dia do quarto bimestre: ");
			double numero04 = scan.nextDouble();
			
			System.out.println("A sua m�dia � = " + (numero01+numero02+numero03+numero04 / 4));
			//Outra maneira
			/*double media = (numero01 + numero02 + numero03 + numero04) / 4;
			System.out.println("A sua m�dia  �: " + media);*/
		}
	}

}
