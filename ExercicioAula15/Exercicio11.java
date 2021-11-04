package ExercicioAula15;

import java.util.Scanner;

/*As organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contrataram
para desenvolver o programa que calcular� os reajustes.
	1.Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
		1.1 Sal�rio at� R$280,00 (incluindo): aumento de 20%;
		1.2 Sal�rio entre R$280,00 e R$700,00: aumento de 15%;
		1.3 Sal�rio entre R$700,00 e R$1.500,00 : aumento de 10%;
		1. Sal�rio entre R$1.500,00 em diante : aumento de 05%;
	2.Ap�s o aumento ser realizado, informe na tela:
		2.1 O sal�rio antes do reajuste;
		2.1 O percentual de aumento aplicado;
		2.3 O valor do aumento;
		2.4 O novo sal�rio, ap�s o aumento.
 */

public class Exercicio11 {

	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Digite seu sal�rio atual: R$ ");
		Double salAtual = scan.nextDouble();
			
		//Crit�rios de aumento
		Double regra01 = (salAtual / 100)* 20 + salAtual;
		Double regra001 = (salAtual / 100)* 20;
		Double regra02 = (salAtual / 100)* 15 + salAtual;
		Double regra002 = (salAtual / 100)* 15;
		Double regra03 = (salAtual / 100)* 10 + salAtual;
		Double regra003 = (salAtual / 100)* 10;
		Double regra04 = (salAtual / 100)* 5 + salAtual;
		Double regra004 = (salAtual / 100)* 5;
		
		
		if ( salAtual <= 280) {
		System.out.println("Sal�rio atual = " + salAtual + " Percentual de aumento aplicado = 20%" + " Valor do aumento = " + regra001 + " Novo sal�rio, ap�s reajuste = " + regra01); 
		} else if ( salAtual > 280 && salAtual <= 700) {
		System.out.println("Sal�rio atual = " + salAtual + " Percentual de aumento aplicado = 15%" + " Valor do aumento = " + regra002 + " Novo sal�rio, ap�s reajuste = " + regra02);
		} else if ( salAtual > 700 && salAtual <= 1500) {
		System.out.println("Sal�rio atual = " + salAtual + " Percentual de aumento aplicado = 10%" + " Valor do aumento = " + regra003 + " Novo sal�rio, ap�s reajuste = " + regra03);
		} else if ( salAtual >= 1500) {
		System.out.println("Sal�rio atual = " + salAtual + " Percentual de aumento aplicado = 05%" + " Valor do aumento = " + regra004 + " Novo sal�rio, ap�s reajuste = " + regra04);
		}
	}		

	}

}
