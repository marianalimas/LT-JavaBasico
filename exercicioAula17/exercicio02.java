package exercicioAula17;

import java.util.Scanner;

public class exercicio02 {

/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio, 
mostrando uma mensagem de erro e voltando a pedir as informa��es.*/
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean infoValidas = false;
			String usuario;
			String senha;
			
			do {
				
				System.out.println("Digite seu nome de usu�rio.");
				usuario = scan.next();
				
				System.out.println("Digite sua senha");
				senha = scan.next();
				
				if (usuario.equalsIgnoreCase(senha)) {
					infoValidas = false;
					System.out.println("Senha igual ao nome de usu�rio. Tente novamente.");
				} else {
					infoValidas = true;
					System.out.println("Senha e usu�rios v�lidos");
				}
				
			} while (!infoValidas);
		}
		
			
  }
}
