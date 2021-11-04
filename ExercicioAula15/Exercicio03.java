package ExercicioAula15;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F -Feminino, M - Masculino, Sexo inválido.

public class Exercicio03 {

	public static void main (String[] args){
		
		try (Scanner scan = new Scanner(System.in)) {
			{
				
				System.out.println("Digite seu sexo (F ou M): ");
				
				//Para string são formas diferentes!!
				
				String input = scan.next();
				
				
				if (input.equalsIgnoreCase("f")){
					System.out.println("F - Feminino");
				} else if (input.equalsIgnoreCase("m")){
					 System.out.println("Masculino");
				} else {
					System.out.println("Sexo inválido");
				}
			
			}
		}
		}
}