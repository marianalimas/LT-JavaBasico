package aula20;

public class ArraysMultidimensionais {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [3][4]; //3 - LINHAS; 4 - COLUNAS 

		//Cada bloco é um array - uma lista separada. Juntos são: arrays de arrays, ou seja - uma matriz.
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 10;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 7;
			
		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 10;
		notasAlunos[1][3] = 7;
				
		notasAlunos[2][0] = 7;
		notasAlunos[2][1] = 10;
		notasAlunos[2][2] = 8;
		notasAlunos[2][3] = 8;
		
		
	//FOR ALINHADO PARA IMPRESSÃO:
			
		for (int i = 0; i<notasAlunos.length; i++) { //Essa linha lê AS LINHAS [3]
			
			for (int j = 0; j<notasAlunos[i].length; j++) { //Essa linha lê AS COLUNAS [4]
				System.out.print(notasAlunos[i][j] + " | ");
			}
			
			System.out.println();
		}	
	//CALCULAR A MÉDIA
		System.out.println();
		System.out.println("Calculando a média de cada aluno");
		System.out.println();
		double soma;
		
		for (int i = 0; i<notasAlunos.length; i++) {
		//Primeiro soma
			soma = 0;
			for (int j=0; j<notasAlunos[i].length; j++)
				soma += notasAlunos[i][j];
		
		System.out.println("Média do aluno " + i + " é = " + (soma/4));
				
	 }
		System.out.println();
		//OUTRA FORMA DE FAZER A MATRIZ
		double [] notaAluno = {7, 8, 9, 10};
		double [][] notasAlunos2 = {{7, 8, 9, 10}, {6, 5, 10, 9}};
		
		System.out.println("Output da matriz Notas Alunos 2");
		
		for (int i = 0; i<notasAlunos2.length; i++) { //Essa linha lê AS LINHAS [3]
			
			for (int j=0; j<notasAlunos2[i].length; j++) { //Essa linha lê AS COLUNAS [4]
				System.out.print(notasAlunos2[i][j] + " | ");
			}
			
			
		
		
		
		
		
	}
  }
}
