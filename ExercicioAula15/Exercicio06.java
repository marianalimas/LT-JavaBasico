package ExercicioAula15;

import java.util.Scanner;

//Fa�a um programa que leia tr�s n�meros e mostre o maior deles.


public class Exercicio06 {

	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro n�mero");
			double num01 = scan.nextDouble();
			
			System.out.println("Entre com o segundo n�mero");
			double num02 = scan.nextDouble();
			
			System.out.println("Entre com o terceiro n�mero");
			double num03 = scan.nextDouble();
					
			if (num01 > num02 && num01 > num03){
				System.out.println(num01 + " � o maior n�mero.");
			} else if (num02 > num01 && num02 > num03){
				System.out.println(num02 + " � o maior n�mero");
			} else if (num03 > num01 && num03 > num02){
				System.out.println(num03 + " � o maior n�mero");
			} else if (num01 == num02 && num01 == num03) {
				System.out.println(num01 + " S�o iguais!");
			} else if (num02 == num01 && num02 == num03){
				System.out.println(num02 + " S�o iguais");
			} else if (num03 == num01 && num03 == num02) {
				System.out.println(num02 + " S�o iguais");
			}	else
				System.out.println(num01 + "ERRO.7");
		}
		
		}

}
