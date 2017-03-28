import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double a = tec.nextDouble();
		double b = tec.nextDouble();
		double c = tec.nextDouble();
		
		double delta = Math.pow(b, 2);
		double delta2 = delta - ((4 * a) * c);
		
		if(delta2 == 0) {
			System.out.println("NEESG");
		}else {
			if (delta < 0) {
				System.out.println("NRR");
			}else {
				double raizDelta = Math.sqrt(delta2);
				double rp = ((-b) + raizDelta) / (2 * a);
				double rn = ((-b) - raizDelta) / (2 * a);
				
				System.out.format("%.2f \n", rp);
				System.out.format("%.2f", rn);
			}
		}
		
	}

}
