package ExercicioAula15;

import java.util.Scanner;

//Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar sabendo que a decis�o � sempre pelo mais barato.

public class Exercicio08 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o pre�o do primeiro produto: ");
			double prod01 = scan.nextDouble();
			
			System.out.println("Entre com o pre�o do segundo produto: ");
			double prod02 = scan.nextDouble();
			
			System.out.println("Entre com o pre�o do terceiro produto: ");
			double prod03 = scan.nextDouble();


			if (prod01 <= prod02 && prod01 <= prod03){
				System.out.println(" O produto 01 tem o menor pre�o: " + prod01);
			} else if (prod02 <= prod01 && prod02 <= prod03){
				System.out.println(" O produto 02 tem o menor pre�o: " + prod02);
			} else if (prod03 <= prod01 && prod03 <= prod02){
				System.out.println(" O produto 03 tem o menor pre�o: " + prod03);
			}
		}
	}

}
