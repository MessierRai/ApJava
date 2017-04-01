package herewegoagain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysTast {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		while(true) {
			int num = tec.nextInt();
			if(num == 0){
				break;
			}
			arr.add(num);
		}
		System.out.println(arr);

		for (int counter:arr) { //percorrer array
			System.out.println(counter);		
		}
		Collections.sort(arr); //ordenar array
		
		for (int counter:arr) {
			System.out.println(counter);		
		}
			
	}
}
