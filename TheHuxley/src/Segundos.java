import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int segDado = tec.nextInt();
		int segHor = 3600;
		int horas = segDado / segHor;
		int rest = segDado % segHor;
		int min = rest / 60;
		int segs = rest % 60;
		
		System.out.println(horas + " h " + min + " m " + segs + " s");
	}

}
