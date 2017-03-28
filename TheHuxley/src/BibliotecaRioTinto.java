import java.util.Scanner;

public class BibliotecaRioTinto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int dias = tec.nextInt();
		double multa = dias * 0.75;
		
		System.out.format("%.2f", multa);
	}

}
