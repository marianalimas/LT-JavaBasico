package Aula17;

public class LoopforPartesAusentes {

	public static void main(String[] args) {
		
		int count = 0;
		for ( ; count < 10 ; ) {
			System.out.println("Valor de count: " + count);
			count +=2 ;
		}
		for (int cont = 0; cont < 10; cont +=2) {
			System.out.println("Valor de cont: " + cont);
		}
		
		//loop infinito for (;; );
		
		
	}

}
