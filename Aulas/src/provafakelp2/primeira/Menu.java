package provafakelp2.primeira;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		Interruptor inter = new Interruptor(lamp);
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			System.out.println("#### Menu Interruptor ####");
			System.out.println("1 - Acender Lampada");
			System.out.println("2 - Apagar Lampada");
			System.out.println("3 - Estado da Lampada");
			System.out.println("0 - Sair");
			System.out.println("##########################");
			
			int e = entrada.nextInt();
			if(e == 0) {
				break;
			}else if(e == 1) {
				inter.acender();
			}else if(e == 2) {
				inter.apagar();
			}else if(e == 3) {
				inter.obterEstado();
			}else {
				System.out.println("Opção Inválida \n");
			}
		}
	}

}
