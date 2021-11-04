package ExercicioAula13;

import java.util.Scanner;

public class Exercicio04 {

	//Faça um programa que peça as 4 notas bimestrais e mostre a média
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite média do primeiro bimestre: ");
			double numero01 = scan.nextDouble();
			System.out.println("Digite média do segundo bimestre: ");
			double numero02 = scan.nextDouble();
			System.out.println("Digite média do terceiro bimestre: ");
			double numero03 = scan.nextDouble();
			System.out.println("Digite média do quarto bimestre: ");
			double numero04 = scan.nextDouble();
			
			System.out.println("A sua média é = " + (numero01+numero02+numero03+numero04 / 4));
			//Outra maneira
			/*double media = (numero01 + numero02 + numero03 + numero04) / 4;
			System.out.println("A sua média  é: " + media);*/
		}
	}

}
