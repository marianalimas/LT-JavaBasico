package ExercicioAula13;

import java.util.Scanner;

//Faça um programa que converta metros para centimetros

//Não soube pensar no cálculo!!

public class Exercicio05 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a quantidade de metros: ");
			double metros = scan.nextDouble();
			
			//1m = 100cm
			
			double cm = metros * 100;
			
			System.out.println(metros + " m é igual a " + cm + " cm");
		}
		
	}

}
