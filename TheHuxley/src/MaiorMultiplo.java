import java.util.Scanner;

public class MaiorMultiplo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		
		int tmp = 0;
		int counter = n1 + 1;
		
		while(counter <= n2) {
			if((counter % n1) == 0) {
				if(counter > tmp) {
					tmp = counter;
				}
			}
			counter+=1;
		}
		
		if(tmp == 0 && tmp != n1) {
			System.out.println("sem multiplus menores que " + n2);
		}else {
			System.out.println(tmp);
		}
	}

}
