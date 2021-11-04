package exercicioAula17;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
 * 			a. nome: Maior que 3 caracteres;
 * 			b. idade : entre 0 e 150;
 * 			c. salário: maior que zero;
 * 			d. sexo f ou m:
 * 			e. estado civil 's', 'c', 'v', 'd';
 */

public class exercicio03 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			boolean infoValidas = false;
			String nome, sexo, estCivil;
			int idade;
			double salario;
			
			
			do {
				System.out.println("Digite seu nome de usuário.");
				nome = scan.next();
				
				if (nome.length() >= 3) {
				infoValidas = true;
				} else {
					System.out.println("Nome precisa ter mais do que três caracteres. Tente novamente.");
				}
				 
				} while (!infoValidas);
			
			infoValidas = false;
			
			do {
				System.out.println("Digite sua idade.");
				idade = scan.nextInt();
				
				if (idade > 0 && idade <= 150) {
				infoValidas = true;
				} else {
					System.out.println("Idade precisa ser entre 0 e 150.");
				}
				 
				} while (!infoValidas);

			infoValidas = false;
			
			do {
				System.out.println("Digite seu salário.");
				salario = scan.nextDouble();
				
				if (salario > 0) {
				infoValidas = true;
				} else {
					System.out.println("Salário precisa ser maior do que 0.");
				}
				 
				} while (!infoValidas);
			
			infoValidas = false;
			
			do {
				System.out.println("Digite seu sexo.");
				sexo = scan.next();
				
				if (sexo.equalsIgnoreCase("f") ||
						sexo.equalsIgnoreCase("m")) {
				infoValidas = true;
				} else {
					System.out.println("Sexo inválido.");
				}
				 
				} while (!infoValidas);

			infoValidas = false;
			
			do {
				System.out.println("Digite seu estado civil ('s', 'c', 'd', 'v')");
				estCivil = scan.next();
				
				if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || estCivil.equalsIgnoreCase("d") ||
						estCivil.equalsIgnoreCase("d")) {
				infoValidas = true;
				} else {
					System.out.println("A letra informada é inválida. Tente novamente.");
				}
				 
				} while (!infoValidas);
			
			System.out.println("As seguintes informações foram coletadas");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Salário: " + salario);
		}
	
	}

}
