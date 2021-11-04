package ExercicioAula15;

import java.util.Scanner;

/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de renda, que depende do salário bruto (conforme a tabela abaixo)
e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O salário líquido corresponde ao Salário Bruto 
menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e quantidade de horas trabalhadas no mês.
 * Desconto do IR:
  - Salário Bruto até 900 (inclusive) - isento;
  - Salário Bruto até 1500 (inclusive) - desconto de 5%;
  - Salário Bruto até 2500 (inclusive) - desconto de 10%;
  - Salário Bruto acima de 2500 (inclusive) - desconto de 20%;
  Imprima na tela:
  Salário Bruto: (h * qdtH) : R$
  (-) IR (5%) 				: R$
  (-) INSS (10%)			: R$
  FGTS (11%)				: R$
  TOTAL DESCONTOS			: R$
  SALÁRIO LÍQUIDO			: R$
  
 */

public class Exercicio12 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor da sua hora trabalhada: ");
			double hora = scan.nextDouble();
			System.out.println("Digite a quantidade de horas trabalhadas");
			double qtd = scan.nextDouble();
			
			double sal = hora * qtd;
			
			//Desconto IR
			int percentual = 0 ;
			if (sal <= 900) {
				percentual = 0;
			} else if (sal > 900 && sal <= 1500) {
				percentual = 5;
			} else if (sal > 1500 && sal <= 2500) {
				percentual = 10;
			} else if (sal > 2500) {
				percentual = 20;
			}
			
			double ir = (sal / 100) * percentual;
			double sindicato = (sal / 100) * 3;
			double inss = (sal / 100) * 10;
			double fgts = (sal / 100) * 11;
			double totaldesc = ir + inss + sindicato;
			double liq = sal - totaldesc;
			
			
			System.out.println("Salário Bruto: " + "( " + hora + " * " + qtd + " ) " + " : R$ " + sal);
			System.out.println("(-) IR " + percentual + " : R$ " + ir);
			System.out.println("(-) INSS (10%) " + " : R$ " + inss);
			System.out.println("FGTS (11%) " + " : R$ " + fgts);
			System.out.println("TOTAL DESCONTOS: " + " : R$ " + totaldesc);
			System.out.println("SALÁRIO LÍQUIDO: " + " : R$ " + liq);
		}
		
		
		
	}

}
