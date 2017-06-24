package padroes.aula.templateMethod.exemplo;

import java.util.Scanner;

public class CompiladorC extends Compilador {

	private String codigoFonte;
	
	public String setCodigo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Codigo fonte:");
		this.codigoFonte = sc.nextLine();
		return this.codigoFonte;
	}

	public void compile() {
		if (this.codigoFonte.contains("main")) {
			System.out.println("Compilado com sucesso!");
		} else {
			System.out.println("Erro ao compilar!");
		}
	}

	public void execute() {
		System.out.println("Ola mundo!");
	}

}
