package ExercicioAula15;

import java.util.Scanner;

/*Faça um programa e pergunte em que turno você estuda. Peça para digitar M-Matutino ou V-Vespertino
ou N-Noturno. Imprimma a mensagem "Bom dia!", "Boa tarde!", "Boa noite!" ou "Valor inválido", conforme o caso.*/

public class Exercicio10 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Qual turno você estuda (V/M OU N) ?");
			String letra = scan.next();
			
			if (letra.equalsIgnoreCase("M")) {
				System.out.println("Bom dia!");
			} else if (letra.equalsIgnoreCase("V")){
				System.out.println("Boa tarde!"); 
			} else if (letra.equalsIgnoreCase("N")) {
				System.out.println("Boa noite!");
			} else {
				System.out.println("Comando inválido!");
			}
		}
	}

}
