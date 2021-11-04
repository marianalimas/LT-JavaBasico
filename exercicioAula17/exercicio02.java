package exercicioAula17;

import java.util.Scanner;

public class exercicio02 {

/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
mostrando uma mensagem de erro e voltando a pedir as informações.*/
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean infoValidas = false;
			String usuario;
			String senha;
			
			do {
				
				System.out.println("Digite seu nome de usuário.");
				usuario = scan.next();
				
				System.out.println("Digite sua senha");
				senha = scan.next();
				
				if (usuario.equalsIgnoreCase(senha)) {
					infoValidas = false;
					System.out.println("Senha igual ao nome de usuário. Tente novamente.");
				} else {
					infoValidas = true;
					System.out.println("Senha e usuários válidos");
				}
				
			} while (!infoValidas);
		}
		
			
  }
}
