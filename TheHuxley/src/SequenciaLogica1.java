import java.util.Scanner;

public class SequenciaLogica1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int max = tec.nextInt();
		int counter = 1;
		while(counter <= max) {
			int n1 = counter * counter;
			int n2 = n1 * counter;
			System.out.println(counter + " " + n1 + " " + n2);
			System.out.println(counter + " " + (n1+1) + " " + (n2+1));
			counter += 1;
		}
	}

}
