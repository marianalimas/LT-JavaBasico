package ExercicioAula15;

import java.util.Scanner;

//Fa�a um programa que leia tr�s n�meros e mostre-os em ordem decrescente.

public class Exercicio09 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro n�mero: ");
			double num01 = scan.nextDouble();
			
			System.out.println("Entre com o segundo n�mero: ");
			double num02 = scan.nextDouble();
			
			System.out.println("Entre com o terceiro n�mero: ");
			double num03 = scan.nextDouble();

			if (num01 <= num02 && num01 <= num03 && num02 <= num03){
				//num1 < num02 < num03
				System.out.println("N�meros em ordem decrescente: " + num01 + ", " + num02 + ", " + num03);
			} else if (num01 <= num02 && num01 <= num03 && num03 <= num02){
				//num1 < num03 < num02
				System.out.println("N�meros em ordem decrescente: " + num01 + ", " + num03 + ", " + num02);
			} else if (num02 <= num01 && num02 <= num03 & num01 <= num03){
				//num02 < num01 < num03
				System.out.println("N�meros em ordem decrescente: " + num02 + ", " + num01 + ", " + num03);
			} else if (num02 <= num01 && num02 <= num03 & num03 <= num01){
				//num02 < num03 < num01
				System.out.println("N�meros em ordem decrescente: " + num02 + ", " + num03 + ", " + num01);
			} else if (num03 > num01 && num03 > num02 && num01 > num02){
				//num03 < num01 < num02
				System.out.println("N�meros em ordem decrescente: " + num03 + ", " + num01 + ", " + num02);
			} else if (num03 > num01 && num03 > num02 && num02 > num01){
				//num03 < num02 < num01
				System.out.println("N�meros em ordem decrescente: " + num03 + ", " + num02 + ", " + num01);
			}
		}
	}

}
