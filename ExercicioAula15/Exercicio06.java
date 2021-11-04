package ExercicioAula15;

import java.util.Scanner;

//Faça um programa que leia três números e mostre o maior deles.


public class Exercicio06 {

	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro número");
			double num01 = scan.nextDouble();
			
			System.out.println("Entre com o segundo número");
			double num02 = scan.nextDouble();
			
			System.out.println("Entre com o terceiro número");
			double num03 = scan.nextDouble();
					
			if (num01 > num02 && num01 > num03){
				System.out.println(num01 + " É o maior número.");
			} else if (num02 > num01 && num02 > num03){
				System.out.println(num02 + " É o maior número");
			} else if (num03 > num01 && num03 > num02){
				System.out.println(num03 + " É o maior número");
			} else if (num01 == num02 && num01 == num03) {
				System.out.println(num01 + " São iguais!");
			} else if (num02 == num01 && num02 == num03){
				System.out.println(num02 + " São iguais");
			} else if (num03 == num01 && num03 == num02) {
				System.out.println(num02 + " São iguais");
			}	else
				System.out.println(num01 + "ERRO.7");
		}
		
		}

}
