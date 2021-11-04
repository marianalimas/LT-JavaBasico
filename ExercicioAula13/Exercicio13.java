package ExercicioAula13;

import java.util.Scanner;

/*Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
	a. salário bruto
	b. quanto pagou ao INSS
	c. o salário líquido
	d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
		
	+ Salário bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - SINDICATO (5%) : R$ = Salário Líquido : R$ */

public class Exercicio13 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite seu salário bruto: ");		
			double salarioBruto = scan.nextDouble();
			double impostoRenda = (salarioBruto / 100) * 11;
			double iNSS = (salarioBruto / 100) * 8;
			/*double sindicato = (salarioBruto / 100) * 5;*/

			double totalDesc = impostoRenda + iNSS;
			double salarioLiq = salarioBruto - impostoRenda - iNSS;
			
			System.out.println("O seu salário bruto é = " + salarioBruto);
			System.out.println("O quanto você pagou ao Imposto de renda = " + impostoRenda);
			System.out.println("O quanto você pagou ao INSS é =  " + iNSS);
			//System.out.println("O quanto você pagou ao sindicato é = " + sindicato);
			
			System.out.println("O total de descontos é = " + totalDesc);
			System.out.println("O seu salário líquido é = " + salarioLiq);
		}
		
		/*System.out.println("Digite o quanto você ganha por hora trabalhada: ");
		double hora = scan.nextDouble();
		System.out.println("Digite o número de horas trabalhadas por mês: ");
		double mes = scan.nextDouble();*/
		
		
	}

}
