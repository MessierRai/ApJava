import java.util.Scanner;

public class QuadradoECubo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int aConsiderar = tec.nextInt();
		int counter = 1;
		
		while(counter <= aConsiderar) {
			int c1 =(int) Math.pow(counter, 2);
			int c2 =(int) Math.pow(counter, 3);
			System.out.println(counter + " " + c1 + " " + c2);
			counter+=1;
		}
	}

}
