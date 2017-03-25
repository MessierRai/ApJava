import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int A = tec.nextInt();
		int B = tec.nextInt();
		int C = tec.nextInt();
		int D = tec.nextInt();
		
		int prodAB = A * B;
		int prodCD = C * D;
		int difABCD = prodAB - prodCD;
		
		System.out.println("DIFERENCA = " + difABCD);
	}

}
