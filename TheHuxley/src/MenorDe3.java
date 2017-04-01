import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenorDe3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int counter = 1;
		while(counter <= 3) {
			int num = tec.nextInt();
			array.add(num);
			counter += 1;
		}
		
		Collections.sort(array);
		
		System.out.println(array.get(0));
	}

}
