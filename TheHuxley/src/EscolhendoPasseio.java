import java.util.ArrayList;
import java.util.Scanner;

public class EscolhendoPasseio {

	public static void main(String[] args) {
		ArrayList<String> votos = new ArrayList<String>();
		Scanner tec = new Scanner(System.in);
		
		int counter = 0;
		while(counter < 7) {
			String voto = tec.nextLine();
			voto = voto.toUpperCase();
			votos.add(voto);
			counter += 1;
		}
		int c1 = 0, c2 = 0;
		for(String cc:votos) {
			if(cc.equals("CINEMA")) {
				c1 += 1;
			}else {
				c2 += 1;
			}
		}
		if(c1 > c2) {
			System.out.println("CINEMA");
		}else {
			System.out.println("BOLICHE");
		}
	}

}
