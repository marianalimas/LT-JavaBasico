package ExercicioAula15;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
//Acrescentei para reconhecer quando não é uma letra.

public class Exercicio04 {

	public static void main (String[] args){
		
		try (Scanner scan = new Scanner(System.in)) {
			{
				
				System.out.println("Digite uma letra MINUSCULA");
				String letra = scan.next();
				
				/*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
					System.out.println(letra + " é uma vogal.");
				} else if (letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("f") || 
						letra.equalsIgnoreCase("g") || letra.equalsIgnoreCase("h") || letra.equalsIgnoreCase("j") || letra.equalsIgnoreCase("k") || letra.equalsIgnoreCase("l") ||
						letra.equalsIgnoreCase("m") || letra.equalsIgnoreCase("n") || letra.equalsIgnoreCase("p") || letra.equalsIgnoreCase("q") || letra.equalsIgnoreCase("r") ||
						letra.equalsIgnoreCase("r") || letra.equalsIgnoreCase("t") || letra.equalsIgnoreCase("w") || letra.equalsIgnoreCase("x") || letra.equalsIgnoreCase("y") ||
						letra.equalsIgnoreCase("z")){
					System.out.println(letra + " é uma consoante.");
				} else {
					System.out.println(letra + " Não é uma letra.");
				}*/
				
				
				// Outra maneira com switch case
				
				switch(letra) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u": System.out.println(letra + " É uma vogal"); break;
				case "b":
				case "c":
				case "d":
				case "f":
				case "g":
				case "h":
				case "j":
				case "k":
				case "l":
				case "m":
				case "n":
				case "p":
				case "q":
				case "r":
				case "s":
				case "t":
				case "w":
				case "x":
				case "y":
				case "z": System.out.println(letra + " É uma consoante."); break;
				default : System.out.println(letra + "Não é uma letra válida."); break;
				}
				
				
			}
		}
	}
}