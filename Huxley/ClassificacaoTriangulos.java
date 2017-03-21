import java.util.Scanner;

public class ClassificacaoTriangulos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int a = tec.nextInt();
		int b = tec.nextInt();
		int c = tec.nextInt();

		if (a == b && b == c) {
			System.out.println("equilatero");
		}if (a != b && b != c && c != a) {
			System.out.println("escaleno");
		}if (( a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
			System.out.println("isosceles");
		}
	}
}