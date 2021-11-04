package exercicioAula17;

import java.util.Scanner;

public class exercicio05 {

	/*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
	 * Valide a entrada e permita repetir a operação.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		
		do {
			System.out.println("Digite o valor da menor população: ");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior do que zero. Tente novamente.");
			} 
			}while (!valido);
		
			valido = false;
			do {
				System.out.println("Digite o valor da maior população: ");
				popB = scan.nextDouble();
				
				if (popB > 0) {
					valido = true;
				} else {
					System.out.println("População B precisa ser maior do que zero. Tente novamente.");
				}
				}while (!valido);
		
			
			valido = false;
			do {
				System.out.println("Digite o valor da taxa de crescimento da população A: ");
				taxaA = scan.nextDouble();
					
				if (taxaA > 0) {
				valido = true;
				} else {
				System.out.println("Valor da taxa precisa ser maior do que zero. Tente novamente.");
    			}
			}while (!valido);
			
    		valido = false;
				do {
				System.out.println("Digite o valor da taxa de crescimento da população B: ");
				taxaB = scan.nextDouble();

				if (taxaB > 0) {
				valido = true;
				} else {
				System.out.println("Valor da taxa precisa ser maior do que zero. Tente novamente.");
				} 
				}while (!valido);
				
				int i = 0;
				
				while (popA <= popB) {
					popA += (popA / 100)* taxaA;
					popB += (popB / 100)* taxaB;
					i++;		
				}

		System.out.println("População final de A =  " + popA + " tem a taxa de crescimento = " + taxaA);
		System.out.println("População final de B = " + popB + " tem a taxa de crescimento = " + taxaB);
		System.out.println("Anos necessários para a População A ultrapassar a População B = " + i);
	
	
	
			
			
	
  }
}

