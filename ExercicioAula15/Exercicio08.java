package ExercicioAula15;

import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar sabendo que a decisão é sempre pelo mais barato.

public class Exercicio08 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o preço do primeiro produto: ");
			double prod01 = scan.nextDouble();
			
			System.out.println("Entre com o preço do segundo produto: ");
			double prod02 = scan.nextDouble();
			
			System.out.println("Entre com o preço do terceiro produto: ");
			double prod03 = scan.nextDouble();


			if (prod01 <= prod02 && prod01 <= prod03){
				System.out.println(" O produto 01 tem o menor preço: " + prod01);
			} else if (prod02 <= prod01 && prod02 <= prod03){
				System.out.println(" O produto 02 tem o menor preço: " + prod02);
			} else if (prod03 <= prod01 && prod03 <= prod02){
				System.out.println(" O produto 03 tem o menor preço: " + prod03);
			}
		}
	}

}
