package aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com sua idade");
			
			int idade = scan.nextInt();
			
			if (idade >=18) {
			//SE N�O SATISFAZ A CONDI��O, COMANDO N�O � EXECUTADO
			System.out.println("� maior de idade");
			
			//SE N�O SAFISTAZ O IF, O ELSE � EXECUTADO.
			} else { System.out.println("N�o � maior de idade");
			}
		}
		
		}
		
		
	}


