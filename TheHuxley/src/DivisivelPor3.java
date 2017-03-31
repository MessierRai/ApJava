import java.util.Scanner;

public class DivisivelPor3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num = tec.nextInt();
		int counter = 1;
		int cc1 = 0;
		
		while(counter <= num) {
			int a = counter % 3;
			int b = num % counter;
			if(a == 0 && b == 0) {
				cc1 += 1;
			}
			counter += 1;
		}
		if(cc1 == 0){
			System.out.println("O numero nao possui divisores multiplos de 3!");
		}else {
			System.out.println(cc1);
		}
	}
}
