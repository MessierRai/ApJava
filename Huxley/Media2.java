import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double n1 = tec.nextDouble();
		double n2 = tec.nextDouble();
		double n3 = tec.nextDouble();

		double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

		System.out.println("MEDIA = " + media);
	}
}