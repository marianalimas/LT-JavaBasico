package ExercicioAula13;

import java.util.Scanner;

/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link
de um link (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). */

public class Exercicio14 {

	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do arquivo para download (em MB)");
			double tamArq = scan.nextDouble();
			
			System.out.println("Digite a velocidade da internet (em Mbps)");
			double velNet = scan.nextDouble();
			
			double tempo = tamArq / velNet;
			
			System.out.println("O tempo de download é: " + tempo);
		}
		

	}

}
