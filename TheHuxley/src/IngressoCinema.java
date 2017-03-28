import java.util.Scanner;

public class IngressoCinema {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		
		if(n1 == 1 || n2 == 1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
