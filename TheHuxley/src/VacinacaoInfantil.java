import java.util.Scanner;

public class VacinacaoInfantil {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int primeiroAno = tec.nextInt();
		int intervalo = tec.nextInt();
		
		int segundoAno = primeiroAno + intervalo;
		int terceiroAno = segundoAno + intervalo;
		int quartoAno = terceiroAno + intervalo;
		
		System.out.println(segundoAno + " " + terceiroAno + " " + quartoAno);
	}

}
