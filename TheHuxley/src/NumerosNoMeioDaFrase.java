import java.util.Scanner;

public class NumerosNoMeioDaFrase {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		int res = n1 + n2;
		
		System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " = " + res);
	}

}
