import java.util.Scanner;

//gpedit.msc > Modelos Administrativos > Componentes do Windows > Windows Update > Desativa

public class ComaBem {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite o valor da conta: ");
		double valor = tec.nextDouble();
		valor = valor * 1.1;
		System.out.format("Valor a pagar: %.2f \n", valor);
	}
}