package exercicioAula17;

public class exercicio06 {

	/*Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele
	 * mostre os n�meros um do lado do outro.*/
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 20 ; i++) {
			System.out.println( i + "");
		} //um embaixo do outro
		
		for (int i = 1; i <= 20 ; i++) {
			System.out.print( i + " ");
		} //um ao lado do outro

	}

}
