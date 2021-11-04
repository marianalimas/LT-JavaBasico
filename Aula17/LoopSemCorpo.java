package Aula17;

public class LoopSemCorpo {

	public static void main(String[] args) {
		int somar = 0;
		for (int i=1; i< 5; somar += i++);{
			//Posso deixar o corpo vazio
		}
		
	//OU
		for (int i=1; i < 5; somar += i++)
		System.out.println("i tem valor: " + i);
		//não é uma boa prática.
		

	}

}
