import java.util.Scanner;

public class ConceitoMEC {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int qtdLivros = tec.nextInt();
		int qtdAlunos = tec.nextInt();
		
		int razao = qtdAlunos / qtdLivros;
		
		if(razao <= 8) {
			System.out.println("A");
		}else {
			if(razao >= 9 && razao <= 12) {
				System.out.println("B");
			}else {
				if(razao >= 13 && razao <= 18) {
					System.out.println("C");
				}else {
					if(razao > 18) {
						System.out.println("D");
					}
				}
			}
		}
	}

}
