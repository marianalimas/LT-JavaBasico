package exercicioAula17;

import java.util.Scanner;

public class exercicio05 {

	/*Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de crescimento iniciais.
	 * Valide a entrada e permita repetir a opera��o.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		
		do {
			System.out.println("Digite o valor da menor popula��o: ");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o A precisa ser maior do que zero. Tente novamente.");
			} 
			}while (!valido);
		
			valido = false;
			do {
				System.out.println("Digite o valor da maior popula��o: ");
				popB = scan.nextDouble();
				
				if (popB > 0) {
					valido = true;
				} else {
					System.out.println("Popula��o B precisa ser maior do que zero. Tente novamente.");
				}
				}while (!valido);
		
			
			valido = false;
			do {
				System.out.println("Digite o valor da taxa de crescimento da popula��o A: ");
				taxaA = scan.nextDouble();
					
				if (taxaA > 0) {
				valido = true;
				} else {
				System.out.println("Valor da taxa precisa ser maior do que zero. Tente novamente.");
    			}
			}while (!valido);
			
    		valido = false;
				do {
				System.out.println("Digite o valor da taxa de crescimento da popula��o B: ");
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

		System.out.println("Popula��o final de A =  " + popA + " tem a taxa de crescimento = " + taxaA);
		System.out.println("Popula��o final de B = " + popB + " tem a taxa de crescimento = " + taxaB);
		System.out.println("Anos necess�rios para a Popula��o A ultrapassar a Popula��o B = " + i);
	
	
	
			
			
	
  }
}

