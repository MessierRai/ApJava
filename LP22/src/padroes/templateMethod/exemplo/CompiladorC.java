package padroes.templateMethod.exemplo;

import java.util.Scanner;

public class CompiladorC extends Compilador {

	private String codigo;
	
	// Hook method
	public String leitura() {	
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	// Operacao 1
	public void setCodigoFonte(String codigo) {
		this.codigo = codigo;
	}

	// Operacao 2
	public void compila() {
		if (this.codigo.contains("main") 
				&& this.codigo.contains("printf")) {
			System.out.println("Código compilado com sucesso!");
		} else {
			System.out.println("Ocorreu um erro ao compilar o código!");
		}
	}
	
}
