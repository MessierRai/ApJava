package herewegoagain;

public class Primo {
	
	public static void primo(int numero) {
		if((numero % 1 == 0) && (numero % numero == 0)) {
			for(int i = 2; i <= (int)Math.sqrt(numero); i+=1) {
				if(numero % i == 0) {
					System.out.println("Não é primo");
					System.out.println("tt");
					System.out.println(i);
					break;
				}
			}
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
			System.out.println("pp");
		}
	}

	public static void main(String[] args) {
		primo(10000);
	}

}
