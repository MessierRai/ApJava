import java.util.Scanner;

public class AlugandoVeiculo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		float temp;
		float temp2;

		int dias = tec.nextInt();
		temp = dias * 90;

		int kmRodados = tec.nextInt();

		if (kmRodados > 100) {
			kmRodados = kmRodados - 100;
			temp2 = kmRodados * 12;

			temp += temp2;

			System.out.format("%.2f \n", temp);
		}else {
			System.out.format("%.2f \n", temp);
		}
	}
}