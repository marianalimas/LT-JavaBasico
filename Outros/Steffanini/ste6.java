package Steffanini;

import java.util.Scanner;

public class ste6 {

	public static void main(String[] args) {

        System.out.println("Informe o NOME DO ALUNO: ");

        Scanner sc = new Scanner(System.in);

        String nomeAluno = sc.next();



        System.out.println("Informe a NOTA 1: ");

        Double nota1 = Double.valueOf(sc.next());



        System.out.println("Informe a NOTA 2: ");

        Double nota2 = Double.valueOf(sc.next());



        System.out.println("Informe a NOTA 3: ");

        Double nota3 = Double.valueOf(sc.next());

        sc.close();



        Double media = (nota1 + nota2 + nota3) / 3;



        System.out.println("O valor da média é " + media);



        if(media > 6) {

            System.out.println("O aluno " + nomeAluno + " está APROVADO");

        }



        if(media < 4) {

            System.out.println("O aluno " + nomeAluno + " está REPROVADO");

        }



        if(media >= 4 && media <= 6) {

            System.out.println("O aluno " + nomeAluno + " deverá fazer a PROVA FINAL");

        }



    }

}
	
	

