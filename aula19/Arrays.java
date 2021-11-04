package aula19;

public class Arrays {

	public static void main(String[] args) {
		//declarando que o array tem 365 posi��es
		double [] temperaturas = new double[365];
			temperaturas[0] = 31.3;
			temperaturas[1] = 32;
			temperaturas[2] = 33.7;
			temperaturas[3] = 34;
			//printando o array na tela
			System.out.println("O valor da temperatura do dia 1 �:" + temperaturas[0]);
			//qual o tamanho do array declarado. quantos arrays posso ocupar das posi��es declaradas
			System.out.println("O tamanho do array: " + temperaturas.length);
			//endere�o de memoria do array
			System.out.println("O valores do array " + temperaturas);
			//todos os valores do array, com indices
			for (int i = 0 ; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia: " + (i+1) + " �: " + temperaturas[i]);
			}
			//for melhorado, s� o valor, n�o indica o contador.
			for (double temp: temperaturas) {
				System.out.println(temp);
			}
			
			
	}

}
