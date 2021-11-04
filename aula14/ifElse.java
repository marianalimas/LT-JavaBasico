package aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com sua idade");
			
			int idade = scan.nextInt();
			
			if (idade >=18) {
			//SE NÃO SATISFAZ A CONDIÇÃO, COMANDO NÃO É EXECUTADO
			System.out.println("É maior de idade");
			
			//SE NÃO SAFISTAZ O IF, O ELSE É EXECUTADO.
			} else { System.out.println("Não é maior de idade");
			}
		}
		
		}
		
		
	}


