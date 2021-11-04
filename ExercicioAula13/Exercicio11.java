package ExercicioAula13;

import java.util.Scanner;

/*Faça um programa que peça 2 números inteiros e um número real.
	Calcule e mostre:
	a. o produto do dobro do primeiro com metade do segundo;
	b. a soma do triplo do primeiro com o terceiro;
	c. o terceiro elevado ao cubo. */


public class Exercicio11 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número inteiro: ");
			int num01 = scan.nextInt();
			System.out.println("Digite outro número inteiro: ");
			int num02 = scan.nextInt();
			System.out.println("Digite um número real: ");
			double num03 = scan.nextDouble();
			
			double a = ((num01 *2) * (num02 / 2));
			double b = (num01 * 3 + num03);
			double c = Math.pow(num03, 3);
			
			System.out.println("a. o produto do dobro do primeiro número com a metade do segundo é: " + a);
			System.out.println("b. a soma do triplo do primeiro com o terceiro; " + b);
			System.out.println("c. o terceiro elevado ao cubo: " + c);
		}
	

	}

}
