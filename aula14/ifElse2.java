package aula14;

import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o pre�o do �tem");
			double valor = scan.nextDouble();
			
			if (valor <= 10) {
				System.out.println("� barato, pode comprar");
			} else if (valor > 10 && valor < 15){
				System.out.println("Voc� pode pedir um desconto ");
			} else if (valor >=15 && valor < 17){
				System.out.println("Pode pesquisar mais");
			} else { // valor >= 17 
				System.out.println("Muito caro");}
		}
		
		//barato <= 10;
		//10 < valor < 15 - pedir desconto;
		//15 <= valor 17 - pesquisar mais;
		//>= 17 - muito caro

		}

 }

