package ExercicioAula13;

import java.util.Scanner;

/*Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
	a. sal�rio bruto
	b. quanto pagou ao INSS
	c. o sal�rio l�quido
	d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		
	+ Sal�rio bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - SINDICATO (5%) : R$ = Sal�rio L�quido : R$ */

public class Exercicio13 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite seu sal�rio bruto: ");		
			double salarioBruto = scan.nextDouble();
			double impostoRenda = (salarioBruto / 100) * 11;
			double iNSS = (salarioBruto / 100) * 8;
			/*double sindicato = (salarioBruto / 100) * 5;*/

			double totalDesc = impostoRenda + iNSS;
			double salarioLiq = salarioBruto - impostoRenda - iNSS;
			
			System.out.println("O seu sal�rio bruto � = " + salarioBruto);
			System.out.println("O quanto voc� pagou ao Imposto de renda = " + impostoRenda);
			System.out.println("O quanto voc� pagou ao INSS � =  " + iNSS);
			//System.out.println("O quanto voc� pagou ao sindicato � = " + sindicato);
			
			System.out.println("O total de descontos � = " + totalDesc);
			System.out.println("O seu sal�rio l�quido � = " + salarioLiq);
		}
		
		/*System.out.println("Digite o quanto voc� ganha por hora trabalhada: ");
		double hora = scan.nextDouble();
		System.out.println("Digite o n�mero de horas trabalhadas por m�s: ");
		double mes = scan.nextDouble();*/
		
		
	}

}
