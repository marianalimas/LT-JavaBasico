package aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com um n�mero: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
	
		//Qual o primeiro n�mero divisivel entre num e m�ximo
	
		for (int i=num; i<=max; i++) {
		 
			if (i % 7 == 0) {
				System.out.println("O valor de i �: " + i);
				//break;
		}//O break sai do for!
	}*/

	//rotulos
		/*for (int i=0; i<=4; i++) {
			rotulo1: {
				rotulo2:{
					rotulo 3:{
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i ==3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println("i");
		}*/
		
		System.out.println("Entre com um n�mero: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
	
	//imprimir todos os valores de i e pular todos os multiplos de 7. Toda vez que ler e executar, for um m�ltiplo de 7, ele vai
		//pular esse multiplo. tipo, continue na pr�xima intera��o.
		for (int i=num; i<=max; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("O valor de i �: " + i);
		}
    }
}