package ExercicioAula15;

import java.util.Scanner;

/*Faça um programa que calcule as raízes qe uma equação do segundo grau, na forma ax2 + bx + c = .
 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
 * A. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve pedir os demais valores, sendo encerrado.
 * B. Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa;
 * C. Se o delta calculado for igual a zero, a equação possui apenas uma raiz real; informe-a ao usuário; 
 * D. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário*/


public class Exercicio16 {

	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o valor de 'a' (!= 0): ");
			int a = scan.nextInt();
				
				if (a == 0) {
				System.out.println(" Valor de a inválido. Tente novamente. Valor de 'a' deve ser diferente de zero");
			
				} else {
					System.out.println("Digite o valor de 'b': ");
				int b = scan.nextInt();
				System.out.println("Digite o valor de 'c': ");
				int c = scan.nextInt();
			
				double delta = ((b*b)- (4 * a * c));
					if (delta < 0) {
						System.out.println(" Valor de b inválido, pois é negativo. Delta negativo, não tem raízes reais.");
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
