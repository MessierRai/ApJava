import java.util.Scanner;

public class ExcessoBagagem {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double kg = tec.nextDouble();
		
		if(kg <= 20) {
			System.out.println("0.00");
		}else {
			if(kg >= 21 && kg <= 25) {
				double valorTotal = (kg - 20) * 12.50;
				System.out.format("%.2f",valorTotal);
			}else {
				if(kg >= 26 && kg <= 30) {
					double valorTotal = (kg - 20) * 32.75;
					System.out.format("%.2f",valorTotal);
				}else {
					if(kg > 30) {
						System.out.println("PESO LIMITE EXCEDIDO");
					}
				}
			}
		}
	}

}
