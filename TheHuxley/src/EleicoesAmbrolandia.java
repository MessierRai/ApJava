import java.util.Scanner;

public class EleicoesAmbrolandia {

	public static void main(String[] args) {
		Scanner urna = new Scanner(System.in);
		
		int alcapone = 0;
		int alibaba = 0;
		int nulo = 0;
		int branco = 0;
		
		while(true) {
			int voto = urna.nextInt();
			if(voto == -1) {
				break;
			}
			if(voto == 93) {
				alcapone += 1;
			}if(voto == 83) {
				alibaba += 1;
			}if(voto == 0) {
				branco += 1;
			}if(voto != 93 && voto != 83 && voto != 0) {
				nulo += 1;
			}
		}
		
		int votosValidos = alcapone + alibaba + branco;
		
		System.out.println(alibaba);
		System.out.println(alcapone);
		System.out.println(branco);
		System.out.println(nulo);
		if(alibaba > alcapone) {
			System.out.println(83);
		}else {
			System.out.println(93);
		}
		double pctgAlibaba = ((double) alibaba / (double) votosValidos) * 100;
		double pctgAlcapone = ((double) alcapone / (double) votosValidos) * 100;
		System.out.format("%.2f\n", pctgAlibaba);
		System.out.format("%.2f\n", pctgAlcapone);
	}

}
