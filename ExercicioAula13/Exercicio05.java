package ExercicioAula13;

import java.util.Scanner;

//Fa�a um programa que converta metros para centimetros

//N�o soube pensar no c�lculo!!

public class Exercicio05 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a quantidade de metros: ");
			double metros = scan.nextDouble();
			
			//1m = 100cm
			
			double cm = metros * 100;
			
			System.out.println(metros + " m � igual a " + cm + " cm");
		}
		
	}

}
