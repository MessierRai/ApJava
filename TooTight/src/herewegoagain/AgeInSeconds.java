package herewegoagain;

import java.util.Scanner;

public class AgeInSeconds {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = entrada.nextInt();
		long segundosAno = 31536000;
		long segsToYears = idade * segundosAno;
		System.out.println(idade + " ano(s), é igual a " + segsToYears + " segundos.");
	}

}
