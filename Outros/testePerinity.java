import java.util.Scanner;

public class testePerinity {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite x: ");
			double x = scan.nextDouble();
			System.out.println("Digite y: ");
			double y = scan.nextDouble();
			
			double z = (x*y) + 5;
			
			System.out.println("Z é igual: " + z);
		}
		
	}

}
