package exercicioAula17;

import java.util.Scanner;

//Altere o programa anterior para mostrar no final a soma dos números.

public class exercicio11 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int num01 = scan.nextInt();	
			System.out.println("Digite um número: ");
			int num02 = scan.nextInt();	
			int soma = num01;
			
for (int i=num01; i<=num02; i++) {
			System.out.println(i);
			soma += i;
}
			System.out.println("Soma = " + soma);
		}
	
	
		
		
		
		
	}

}
