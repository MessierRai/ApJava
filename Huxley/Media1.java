import java.util.Scanner;

public class Media1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double n1 = tec.nextDouble();
		double n2 = tec.nextDouble();

		double media = ((n1 * 3.5) + (n2 * 7.5)) / 11;

		System.out.format("MEDIA = %.5f \n", media);
	}
}