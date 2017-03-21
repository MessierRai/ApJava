import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int ac = 0;
		int ac2 = 0;
		while ( ac != -1) {
			System.out.print("Digite um numero: ");
			ac = tec.nextInt();
			ac2 = ac2 + ac;
		}
		System.out.println("A soma dos numeros é " + ac2);
	}
}