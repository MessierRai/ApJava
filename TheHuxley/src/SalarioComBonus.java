import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String nome = tec.nextLine();
		double salario = tec.nextDouble();
		double vendasMes = tec.nextDouble();
		
		double total = (vendasMes * 0.15) + salario;
		
		System.out.printf("TOTAL = R$ %.2f", total);
	}

}
