import java.util.Scanner;

public class MediaAlunos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int a = tec.nextInt();
		int b = tec.nextInt();
		int c = tec.nextInt();

		float media = (a + b + c) / 3;

		if (media >= 7) {
			System.out.println("aprovado");
		}if (media < 3) {
			System.out.println("reprovado");
		}if (media >= 3 && media < 7) {
			System.out.println("prova final");
		}
	}
}