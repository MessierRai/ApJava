import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		int n = tec.nextInt();
		
		System.out.println(fatorial(n));
	}
	
	public static int fatorial(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else if(n == 0) {
			return 0;
		}else {
			return ((n - 2) + fatorial(n - 1));
		}
	}

}
