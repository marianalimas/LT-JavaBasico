package aula19;

/*Fa�a um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma dos seus �ndices (exemplo:M[1,2,1] = (1+2+1 = 4)
Obtenha a soma de todos os elementos da matriz, e obtenha soma dos elementos cujos valores s�o pares e a soma dos elementos cujps valores
s�o �mpares. Exibir na tela os valores da soma total, soma dos pares e soma dos �mpares. */

public class arraysMultidimensionais {

	public static void main(String[] args) {
		
		int [][][] matrizTridimensional = new int [3][3][3];
		
		for (int i=0; i<matrizTridimensional.length; i++) {
			for(int j=0; j<matrizTridimensional.length; j++) {
				for(int k=0; k<matrizTridimensional.length; k++) {
					System.out.println("i = " + i + " | j = " + j + " | k = " + k);
					matrizTridimensional[i][j][k]= i + j + k;
					
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int i=0; i<matrizTridimensional.length; i++) {
			for(int j=0; j<matrizTridimensional.length; j++) {
				for(int k=0; k<matrizTridimensional.length; k++) {
					
					soma += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimensional[i][j][k];
					}else {
						somaImpares += matrizTridimensional[i][j][k];
					}
					
				}
			}
		}
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma total Pares = " + somaPares);
		System.out.println("Soma total Impares = " + somaImpares);
	}

}
