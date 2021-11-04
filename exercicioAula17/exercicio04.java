package exercicioAula17;

public class exercicio04 {

/*Supondo que a popula��o de um pa�s A seja de ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% 
 e que a popula��o de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
 * Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A 
 * ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.
 */
	
	public static void main(String[] args) {
			
		int popA = 80000;
		int popB = 200000;
		int i = 0;
		
		while (popA <= popB) {
			popA += (popA / 100)* 3;
			popB += (popB / 100)* 1.5;
			i++;		
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Anos necess�rios para a Popula��o A ultrapassar a Popula��o B: " + i);
	}

}
