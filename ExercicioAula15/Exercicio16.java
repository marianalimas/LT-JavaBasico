package ExercicioAula15;

import java.util.Scanner;

/*Fa�a um programa que calcule as ra�zes qe uma equa��o do segundo grau, na forma ax2 + bx + c = .
 * O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
 * A. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve pedir os demais valores, sendo encerrado.
 * B. Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais. Informe ao usu�rio e encerre o programa;
 * C. Se o delta calculado for igual a zero, a equa��o possui apenas uma raiz real; informe-a ao usu�rio; 
 * D. Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio*/


public class Exercicio16 {

	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o valor de 'a' (!= 0): ");
			int a = scan.nextInt();
				
				if (a == 0) {
				System.out.println(" Valor de a inv�lido. Tente novamente. Valor de 'a' deve ser diferente de zero");
			
				} else {
					System.out.println("Digite o valor de 'b': ");
				int b = scan.nextInt();
				System.out.println("Digite o valor de 'c': ");
				int c = scan.nextInt();
			
				double delta = ((b*b)- (4 * a * c));
					if (delta < 0) {
						System.out.println(" Valor de b inv�lido, pois � negativo. Delta negativo, n�o tem ra�zes reais.");
					}else {
						
				System.out.println("Valor de Delta: " + delta); 		
						
				double x1 = ((-b + Math.sqrt(delta))/(2*a));		
				double x2 = ((-b - Math.sqrt(delta))/(2*a));	
						
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
						
						
					}
				
			}
					
			
			
	
				
				
	
	
		}
	
	}

}
