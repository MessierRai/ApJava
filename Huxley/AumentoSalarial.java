import java.util.Scanner;

public class AumentoSalarial {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		float salario = tec.nextFloat();

		if (salario >= 1000 && salario <= 2000) {
			salario *= 1.1;
			System.out.format("%.2f \n", salario);
		}if (salario < 1000) {
			salario *= 1.3;
			System.out.format("%.2f \n", salario);
		}if (salario > 2000) {
			System.out.format("%.2f \n", salario);
		}
	}
}