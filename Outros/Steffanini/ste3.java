package Steffanini;

import java.util.Scanner;

public class ste3 {

		    public static void main(String[] args) {

		 

		        System.out.println("Informe o VALOR HORA: ");

		        Scanner sc = new Scanner(System.in);

		        Double valorHora = Double.valueOf(sc.next());



		        System.out.println("Informe o NUMERO DE HORAS TRABALHADAS NO MES: ");

		        Double numeroHorasMes = Double.valueOf(sc.next());



		        System.out.println("Informe o PERCENTUAL DE DESCONTO DO INSS: ");

		        Double desconto = Double.valueOf(sc.next());

		        sc.close();



		        Double salarioBruto = valorHora * numeroHorasMes;

		        Double salarioLiquido = salarioBruto - salarioBruto * (desconto / 100);



		        System.out.println("Salario bruto: " + salarioBruto);

		        System.out.println("Salário liquido: " + salarioLiquido);

		    }

		

	}


