import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		float n1, n2, media;
		
		n1 = tec.nextFloat();
		n2 = tec.nextFloat();
		
		media = ((n1 * 4) + (n2 * 6) / (4 + 6));
		
		System.out.format("Media igual a %.2f", media);
	}

}
